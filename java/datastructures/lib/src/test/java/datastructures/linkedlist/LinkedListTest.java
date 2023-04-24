package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }

  @Test void testInsertFront(){
   LinkedList.insertFront(1);
   LinkedList.insertFront(2);
   LinkedList.insertFront(3);

   boolean isItInThere = LinkedList.includes(1);
   boolean isNotInThere = LinkedList.includes(4);
    assertEquals(3, LinkedList.head.value);

    System.out.println("is the value of 1 in the linked list? = " + isItInThere);
    System.out.println("is the value of 4 in the linked list? = " + isNotInThere);

    }

}
