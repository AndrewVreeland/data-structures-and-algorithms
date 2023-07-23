package codechallenges.hashTable;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap <Key,Value> {

  ArrayList<LinkedList<HashMapPair<Key, Value>>> bucketArrayList;

int size;

public HashMap(){
  if(size< 1){
    throw new IllegalArgumentException("HashMap Size Must Be 1 Or Greater");
  }

  this.size = size;
  this.bucketArrayList = new ArrayList<>(size);

  for (int i = 0; i < this.size; i ++){
    bucketArrayList.add(i, new LinkedList<>());
  }
}
// make sure to replace if the key is a dupe
public void add(Key key, Value value){
  // Compute the hash value for the key
  int index = hash(key);

  // Check if the index is empty
  LinkedList<HashMapPair<Key, Value>>[] table = new LinkedList[0];
  if (table[index] == null) {
    // Create a new data structure (e.g., LinkedList, ArrayList, etc.) for the bucket at the index
    table[index] = new LinkedList<HashMapPair<Key, Value>>();
  }

  // Get the bucket at the index
  LinkedList<HashMapPair<Key, Value>> bucket = table[index];

  // Check if the key already exists in the bucket
  for (HashMapPair<Key, Value> entry : bucket) {
    if (entry.getKey().equals(key)) {
      // Key already exists, update the corresponding value
      entry.setValue(value);
      return;
    }
  }

  // Key doesn't exist, add a new entry to the bucket
  bucket.add(new HashMapPair<Key, Value>(key, value));
}

public void set(Key key, Value value){

  // Compute the hash value for the key
  int index = hash(key);

  // Check if the index is empty
  LinkedList[] table = new LinkedList[0];
  if (table[index] == null) {
    // Create a new data structure (e.g., LinkedList, ArrayList, etc.) for the bucket at the index
    table[index] = new LinkedList<HashMapPair<Key, Value>>();
  }

  // Get the bucket at the index
  LinkedList<HashMapPair<Key, Value>> bucket = table[index];

  // Check if the key already exists in the bucket
  for (HashMapPair<Key, Value> entry : bucket) {
    if (entry.getKey().equals(key)) {
      // Key already exists, update the corresponding value
      entry.setValue(value);
      return;
    }
  }

  // Key doesn't exist, add a new entry to the bucket
  bucket.add(new HashMapPair<Key, Value>(key, value));

}

  public Value get(Key key){
    // Compute the hash value for the key
    int index = hash(key);

    // Get the bucket at the index
    LinkedList<HashMapPair<Key, Value>>[] table = new LinkedList[0];
    LinkedList<HashMapPair<Key, Value>> bucket = table[index];

    // Check if the bucket exists and is not empty
    if (bucket != null && !bucket.isEmpty()) {
      // Search for the key in the bucket
      for (HashMapPair<Key, Value> entry : bucket) {
        if (entry.getKey().equals(key)) {
          // Key found, return the corresponding value
          return entry.getValue();
        }
      }
    }

    // Key not found
    return null;
  }

  public boolean contains(Key key){
    // Compute the hash value for the key
    int index = hash(key);

    // Get the bucket at the index
    LinkedList<HashMapPair<Key, Value>>[] table = new LinkedList[0];
    LinkedList<HashMapPair<Key, Value>> bucket = table[index];

    // Check if the bucket exists and is not empty
    if (bucket != null && !bucket.isEmpty()) {
      // Search for the key in the bucket
      for (HashMapPair<Key, Value> entry : bucket) {
        if (entry.getKey().equals(key)) {
          // Key found
          return true;
        }
      }
    }

    // Key not found
    return false;
  }

  public List<Key> Keys() {
    List<Key> keys = new ArrayList<>();

    // Iterate over each bucket in the hash table
    LinkedList<HashMapPair<Key, Value>>[] table = new LinkedList[0];
    for (LinkedList<HashMapPair<Key, Value>> bucket : table) {
      if (bucket != null && !bucket.isEmpty()) {
        // Retrieve the keys from each entry in the bucket
        for (HashMapPair<Key, Value> entry : bucket) {
          keys.add(entry.getKey());
        }
      }
    }

    return keys;
  }

  public int hash(Key key){
  return Math.abs(key.hashCode() % size);
  }


}
