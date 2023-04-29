package stackAndQueue;



public class StackAndQueue {

  private Node top;
  private Node rear;
  private Node front;
  private Node temp;

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
      temp = top;
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

//TODO: QUEUE

  //enqueue method
  public void enqueue(int value){
    Node newNode = new Node(value);

    if(rear != null ){
      newNode.next = rear;
    }
    rear = newNode;
  }

  public int dequeue() throws Exception{
    if(front == null){
      throw new Exception("Queue is empty");
    }else{
      temp = front;
      int value = front.value;
    front = front.next;
    temp.next = null;
    return temp.value;
    }
  }

  public int peekQueue() throws Exception{
    if(front == null){
      throw new Exception("Queue is empty");
    }else{
      return front.value;
    }
  }

  public boolean isQueueEmpty(){
    if (front == null){
      return true;
    }else{
      return false;
    }
  }

}
