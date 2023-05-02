package stackAndQueue;


import org.testng.annotations.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;
public class QueueTest {
  java.util.Stack<Integer> stack = new Stack<Integer>();
  private Node rear;
  private Node front;
  Queue queue = new Queue() {
  };
//  @Test
//  public void testQueue() throws Exception {
//    queue.enqueue(1);
//    queue.enqueue(2);
//    queue.enqueue(3);
//
//    assertFalse(3, queue.peekQueue());
//    assertTrue(queue.peekQueue());
//    assertTrue(queue.front.next.value == 2);
//  }
//
//  @Test
//  public void testDequeue() throws Exception{
//    queue.enqueue(1);
//    queue.enqueue(2);
//    queue.enqueue(3);
//
//    assertEquals(1, queue.dequeue());
//    assertEquals(2, queue.dequeue());
//    assertEquals(3, queue.dequeue());
//    assertTrue(queue.isQueueEmpty());
//  }
//
//  @Test
//  public void testPeekQueue() throws Exception {
//    queue.enqueue(1);
//    queue.enqueue(2);
//    queue.enqueue(3);
//    assertFalse(2, queue.peekQueue());
//    assertTrue(queue.peekQueue());
//  }
//
//  @Test
//  public void testIsEmpty() throws Exception {
//    queue.enqueue(1);
//    assertFalse(null, queue.isQueueEmpty());
//    queue.dequeue();
//    assertTrue(isQueueEmpty());
//  }


}
