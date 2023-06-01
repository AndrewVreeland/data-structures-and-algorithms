package hashTableTest;

import codechallenges.hashTable.HashMap;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class HashMapTest {

  @Test
  public void testGetExistingKey() {
    // Create an instance of your hash map implementation
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Add key/value pairs to the hash map
    hashMap.add("Apple", 1);
    hashMap.add("Banana", 2);
    hashMap.add("Cherry", 3);

    // Retrieve value for an existing key
    Integer value = hashMap.get("Apple");

    // Assert the expected value
    assertEquals(Integer.valueOf(1), value);
  }


  @Test
  public void testSetNewKey() {
    // Create an instance of your hash map implementation
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Set a new key/value pair
    hashMap.set("Apple", 1);

    // Retrieve the value for the key
    Integer value = hashMap.get("Apple");

    // Assert the expected value
    assertEquals(Integer.valueOf(1), value);
  }

  @Test
  public void testSetExistingKey() {
    // Create an instance of your hash map implementation
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Add an initial key/value pair
    hashMap.set("Apple", 1);

    // Set a new value for an existing key
    hashMap.set("Apple", 2);

    // Retrieve the updated value for the key
    Integer value = hashMap.get("Apple");

    // Assert the expected value
    assertEquals(Integer.valueOf(2), value);
  }
  @Test
  public void testGetNonExistingKey() {
    // Create an instance of your hash map implementation
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Add some key/value pairs to the hash map
    hashMap.set("Apple", 1);
    hashMap.set("Banana", 2);
    hashMap.set("Cherry", 3);

    // Retrieve value for a non-existing key
    Integer value = hashMap.get("Orange");

    // Assert the expected value to be null
    assertEquals(null, value);
  }
  @Test
  public void testKeys() {
    // Create an instance of your hash map implementation
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Add some key/value pairs to the hash map
    hashMap.set("Apple", 1);
    hashMap.set("Banana", 2);
    hashMap.set("Cherry", 3);

    // Retrieve the keys from the hash map
    List<String> keys = hashMap.Keys();

    // Assert the expected keys
    assertEquals(3, keys.size());
    assertTrue(keys.contains("Apple"));
    assertTrue(keys.contains("Banana"));
    assertTrue(keys.contains("Cherry"));
  }

  public void testSetCollision() {
    // Create an instance of your hash map implementation
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Set key/value pairs that will collide
    hashMap.set("Apple", 1);
    hashMap.set("Banana", 2);
    hashMap.set("Orange", 3);

    // Set a new value for a colliding key
    hashMap.set("Banana", 4);

    // Retrieve the values for the colliding keys
    Integer value1 = hashMap.get("Apple");
    Integer value2 = hashMap.get("Banana");
    Integer value3 = hashMap.get("Orange");

    // Assert the expected values
    assertEquals(Integer.valueOf(1), value1);
    assertEquals(Integer.valueOf(4), value2);
    assertEquals(Integer.valueOf(3), value3);
  }

  @Test
  public void testGetCollision() {
    // Create an instance of your hash map implementation
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Set key/value pairs that will collide
    hashMap.set("Apple", 1);
    hashMap.set("Banana", 2);
    hashMap.set("Orange", 3);

    // Retrieve the values for the colliding keys
    Integer value1 = hashMap.get("Apple");
    Integer value2 = hashMap.get("Banana");
    Integer value3 = hashMap.get("Orange");

    // Assert the expected values
    assertEquals(Integer.valueOf(1), value1);
    assertEquals(Integer.valueOf(2), value2);
    assertEquals(Integer.valueOf(3), value3);

}
  @Test
  public void testHashInRange() {
    // Create an instance of your hash map implementation
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Hash some keys and verify they are in the valid range
    String key1 = "Apple";
    String key2 = "Banana";
    String key3 = "Orange";
    int hash1 = hashMap.hash(key1);
    int hash2 = hashMap.hash(key2);
    int hash3 = hashMap.hash(key3);

    assertTrue(hash1 >= 0 && hash1 < 10);
    assertTrue(hash2 >= 0 && hash2 < 10);
    assertTrue(hash3 >= 0 && hash3 < 10);
  }
}
