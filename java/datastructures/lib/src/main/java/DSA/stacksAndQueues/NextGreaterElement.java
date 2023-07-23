package DSA.stacksAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
  public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> list){
    Integer highestValue = list.get(0);
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> finalList = new ArrayList<>();

for (int i = list.size() -1; i >= 0; i --){
  stack.push(list.get(i));
}



while(!stack.isEmpty()){

  if(stack.peek() > highestValue){
    highestValue = stack.peek();
    finalList.add(highestValue);
  } else if (highestValue.equals(stack.peek())) {
    finalList.add(-1);
  } else{
    finalList.add(highestValue);
  }
  stack.pop();
}
return finalList;




  }
}
