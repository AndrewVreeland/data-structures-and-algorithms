package codechallenges.stackAndQueue;



public class Queue {


  private Node rear;
  Node front = new Node();
  private Node temp;



//TODO: QUEUE

  //enqueue method
  public void enqueue(int value){
    Node newNode = new Node(value);
    if(rear == null){
      front.next = newNode;
      rear = newNode;
    }else{
      rear.next = newNode;
      rear = newNode;
    }


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


  // getters and setters
  public Node getRear() {
    return rear;
  }

  public void setRear(Node rear) {
    this.rear = rear;
  }

  public Node getFront() {
    return front;
  }

  public void setFront(Node front) {
    this.front = front;
  }

  public Node getTemp() {
    return temp;
  }

  public void setTemp(Node temp) {
    this.temp = temp;
  }
}
