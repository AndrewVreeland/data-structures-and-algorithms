package codechallenges.stackAndQueue;

import codechallenges.stackAndQueue.Node;



public class PseudoQueue {



  Stack stack1 = new Stack();
  Stack stack2 = new Stack();



  public void enqueue(int newValue) throws Exception {


    if (stack1 == null) {
      return; }

    int value;

    while (!stack1.isEmpty()){
      value = stack1.pop();
      stack2.push(value);
    }

    stack1.push(newValue);

    while(stack2 != null){
      value = stack2.pop();
      stack1.push(value);
    }


  }

//  public int dequeue(){
//
//    if (stack1 == null){
//      return null;
//    }
//
//    if (stack1.top == null){
//      return null;
//    }
//
//    while(stack1.top != null){
//      value = stack1.pop();
//      stack2.push(value);
//    }
//    returnValue = stack2.pop();
//
//    while(stack2 != null){
//      value = stack2.pop();
//      stack1.push(value);
//    }
//    return returnValue;
//  }


}
