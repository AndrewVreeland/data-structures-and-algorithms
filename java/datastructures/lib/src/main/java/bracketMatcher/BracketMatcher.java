package bracketMatcher;



import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketMatcher {
  public static boolean isProperlyMatched(String s) throws Exception {
    Stack<Character> stack = new Stack<Character>();
    Map<Character, Character> map = new HashMap<Character, Character>();
    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsKey(c)) { // opening bracket
        stack.push(c);
      } else if (map.containsValue(c)) { // closing bracket
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        if (map.get(top) != c) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }
}
