package codechallenges.hashTable;


import java.util.*;


public class LeftJoin {

  public HashMap<String, List<String>> leftJoin(Map<String, String> synonyms, Map<String, String> antonyms) {

    HashMap<String, List<String>> output =  new HashMap<>();

    for (String key : synonyms.keySet()) {

      List<String> values = new ArrayList<>();

      values.add(synonyms.get(key));

      values.add(antonyms.getOrDefault(key, null));


    }
    return output;
  }
}
