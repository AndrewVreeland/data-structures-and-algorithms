package codechallenges.hashTable;

import java.util.AbstractMap;

public class HashMapPair<Key, Value> extends AbstractMap.SimpleEntry<Key,Value > {

public HashMapPair(Key key, Value value) {
  super(key,value);
}

}
