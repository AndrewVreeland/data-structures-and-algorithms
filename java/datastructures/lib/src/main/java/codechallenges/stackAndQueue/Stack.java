package codechallenges.stackAndQueue;

public class Stack {
  private Node top;
  //TODO: Stack

  // Push method
  public void push(int value) {
    Node newNode = new Node(value);
    if (top != null) {
      newNode.next = top;
    }
    top = newNode;
  }

  // Pop method
  public int pop() throws Exception {
    if (top == null) {
      throw new Exception("Stack is empty");
    } else {
      Node temp = top;
      int value = top.value;
      top = top.next;
      temp.next = null;
      return value;
    }
  }

  // Peek method
  public int peek() throws Exception {
    if (top == null) {
      throw new Exception("Stack is empty");
    } else {
      return top.value;
    }
  }

  // Is empty method
  public boolean isEmpty() {
    if (top == null){
      return true;
    } else{
      return false;
    }
  }
}
