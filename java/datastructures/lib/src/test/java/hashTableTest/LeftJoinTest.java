package hashTableTest;

import codechallenges.hashTable.LeftJoin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftJoinTest {


  @Test
  public void testLeftJoin() {
    LeftJoin sut = new LeftJoin();
    Map<String, String> synonyms = new HashMap<>();
    synonyms.put("diligent", "employed");
    synonyms.put("fond", "enamored");
    synonyms.put("guide", "usher");
    synonyms.put("outfit", "garb");
    synonyms.put("wrath", "anger");

    Map<String, String> antonyms = new HashMap<>();
    antonyms.put("diligent", "idle");
    antonyms.put("fond", "averse");
    antonyms.put("guide", "follow");
    antonyms.put("flow", "jam");
    antonyms.put("wrath", "delight");

    Map<String, List<String>> expectedOutput = new HashMap<>();
    expectedOutput.put("diligent", Arrays.asList("employed", "idle"));
    expectedOutput.put("fond", Arrays.asList("enamored", "averse"));
    expectedOutput.put("guide", Arrays.asList("usher", "follow"));
    expectedOutput.put("outfit", Arrays.asList("garb", null));
    expectedOutput.put("wrath", Arrays.asList("anger", "delight"));

    Assertions.assertEquals(expectedOutput, sut.leftJoin(synonyms, antonyms));
  }
}
