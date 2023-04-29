package stackAndQueue;



public class StackAndQueue {

  private Node top;

  // Push method
  public void push(int value) {
    Node newNode = new Node(value);
    if (top == null) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
  }

  // Pop method
  public int pop() throws Exception {
    if (top == null) {
      throw new Exception("Stack is empty");
    } else {
      int value = top.value;
      top = top.next;
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
    return top == null;
  }

  // Node class
  private class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
    }
  }

}
