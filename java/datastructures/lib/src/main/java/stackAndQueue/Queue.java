package stackAndQueue;



public class Queue {


  private Node rear;
  Node front;
  private Node temp;



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
