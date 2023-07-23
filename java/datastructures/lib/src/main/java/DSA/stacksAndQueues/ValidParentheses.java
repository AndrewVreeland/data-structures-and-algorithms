package DSA.stacksAndQueues;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {


  HashMap<Character, Character> validPairs = new HashMap<>();
Stack<Character> stack = new Stack<>();

  ValidParentheses(){
validPairs.put(')', '(');
    validPairs.put('}', '{');
    validPairs.put(']', '[');
  }

boolean isValid(String string ){
  for (int i = 0; i < string.length(); i --){
    char ch = string.charAt(i);
    if(stack.top){

    }
  }


  if (stack.isEmpty()){
    return true;
  } else{
    return false;
  }

}

}
