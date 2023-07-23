package DSA.linkedList;


public class AddTwoNumbers {

  public static class Node {
    public int value;
    public Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static class LinkedList<I extends Number> {
    public Node head;

    public LinkedList() {
      this.head = null;
    }
  }

  public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
    Node front = new Node(0);
    Node current = new Node(0);
    Node previous = null;
    Node front2 = new Node(0);
    Node current2 = new Node(0);
    Node previous2 = null;
    Node newNode = new Node(0);
    Integer number;

    if (list1 == null || list2 == null) {
      return null;
    }
    if (list1.head == null || list2.head == null) {
      return null;
    }
    front = list1.head.next;
    current = list1.head;

    while (front != null){
      current.next = previous;
      previous = current;
      current = front;
      front = front.next;
    }

    list1.head = current;

    front2 = list2.head.next;
    current2 = list2.head;


    while (front2 != null){
      current2.next = previous2;
      previous2 = current2;
      current2 = front2;
      front2 = front2.next;
    }

    list2.head = current2;



    while (current2 != null){
      number = current.value + current2.value;
      if(number > 9){
        current.value = number - 10;
        if(current.next == null){
          current.next = newNode;
          newNode.value = 1;
        }else{
          current.next.value += 1;
        }

        if(current.next != null){
          current = current.next;
        }

        current2 = current2.next;

        if(current.next == null){
          break;
        }
      }
    }
    while(current.next == null && current2 != null){
      current.next = current2;
      current = current.next;
      current2 = current2.next;
    }

    return list1;

  }
}
