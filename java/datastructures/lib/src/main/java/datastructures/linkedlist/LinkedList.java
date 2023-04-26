
package datastructures.linkedlist;

public class LinkedList  {
  static Node head = null;
// Node tail =null; optional



  public void insertAfter(int value, int newValue) throws IllegalArgumentException {
    if (head == null) {
      throw new IllegalArgumentException("value not in list");
    }
    Node temp = head;
    Node newNode = new Node(newValue);

    while (temp != null) {
      if (temp.value == value) {
        newNode.next = temp.next;
        temp.next = newNode;
        return;
      }
      temp = temp.next;
    }

    throw new IllegalArgumentException("value not in list");
  }

  public void appendNode(int value){
    Node newNode = new Node(value);
    if(head == null){
      head = newNode;
    }else{
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }
  public void insertBefore(int value, int newValue) throws IllegalArgumentException {
    if (head == null) {
      throw new IllegalArgumentException("value not in list");
    }
    Node temp = head;
    Node prevTemp = null;
    Node newNode = new Node(newValue);

    if (temp.value == value) {
      newNode.next = temp;
      head = newNode;
      return;
    }

    while (temp.next != null) {
      prevTemp = temp;
      temp = temp.next;
      if (temp.value == value) {
        newNode.next = temp;
        prevTemp.next = newNode;
        return;
      }
    }

  }

  public static void insertFront(int value) {
    // TODO: implement me!
    // add a new node as the head of the LinkedList
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  public static boolean includes(int value) {
// TODO: implement me!
    // tell whether or not there is a node with the given value in the linked list
    Node temp = head;
    while (temp != null) {
      if (temp.value == value) {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  @Override
  public String toString() {
    // Iterate over linked list and return the data as a string
    StringBuilder result = new StringBuilder();
    Node temp = head;
    while (temp != null) {
      result.append(temp.value);
      if (temp.next != null) {
        result.append("->");
      }
      temp = temp.next;
    }
    return result.toString();
  }

  public static void main(String[] args) {
    // Example usage
    LinkedList myLL = new LinkedList();
    insertFront(5);
    insertFront(4);
    insertFront(3);
    insertFront(2);
    insertFront(1);

    System.out.println(myLL); // Output: 1->2->3->4->5
    System.out.println(includes(3)); // Output: true
    System.out.println(includes(6)); // Output: false
  }
}

//LinkedList myLL - new LinkedList();
//myLL.insertFront(5);
