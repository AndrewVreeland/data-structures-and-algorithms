package codechallenges.stackAndQueue;

import codechallenges.stackAndQueue.Node;



public class PseudoQueue extends Stack {



  Stack stack1 = new Stack();
  Stack stack2 = new Stack();



  public void enqueue(int newValue)  throws Exception {


    if (stack1.isEmpty()) {
      stack1.push(newValue);
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

  public int dequeue() throws Exception {

    if (stack1.isEmpty()){
      throw new Exception("Queue is empty");
    }

    if (stack1.peek() == 0) {
      throw new Exception("Queue is empty");
    }

    while(!stack1.isEmpty()){
      int value;
      value = stack1.pop();
      stack2.push(value);
    }
    int returnValue = stack2.pop();

    while(stack2 != null){
      int stack2Value = stack2.pop();
      stack1.push(stack2Value);
    }
    return returnValue;
  }


}
