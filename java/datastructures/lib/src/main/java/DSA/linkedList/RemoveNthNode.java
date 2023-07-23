package DSA.linkedList;

import codechallenges.hashTable.HashMap;




public class RemoveNthNode {
  public static class Node {
    public int value;
    public RemoveNthNode.Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static class LinkedList<I extends Number> {
    public RemoveNthNode.Node head;

    public LinkedList() {
      this.head = null;
    }
  }
  public static void RemoveNode(LinkedList<Integer> list, int value){


    if (list == null){
      return;
    }
    if (list.head == null){
      return;
    }

    Node temp = new Node(value);
    Node current = new Node(value);

    temp = list.head;
    current = list.head;
    int length = 0;

    while(temp.next != null){
      temp = temp.next;
      length ++;
    }

    temp = list.head;

    if (value > length){
      return;
    } else {
      for (int i = 0; i <= value; i ++){
        temp = temp.next;
      }
    }
    while(temp.next != null){
      temp = temp.next;
      current = current.next;
    }
    current.next = temp;

  }
}
