package stackAndQueue;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;
import java.util.Queue;



import static org.junit.jupiter.api.Assertions.*;
public class QueueTest {
  private Node rear;
  private Node front;
  Queue<Integer> queue = new Queue<Integer>() {
  };
  @test
  public void testQueue(){
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    assertFalse(3, queue.peekQueue());
    assertTrue(1, queue.peekQueue());
    assertTrue(2, queue.front.next == 2);
  }

  @test
  public void testDequeue() throws Exception{
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    assertEquals(1, queue.dequeue());
    assertEquals(2, queue.dequeue());
    assertEquals(3, queue.dequeue());
    assertTrue(queue.isQueueEmpty());
  }

  @test
  public void testPeekQueue(){
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertFalse(2, queue.peekQueue());
    assertTrue(1, queue.peekQueue());
  }

  @test
  public void testIsEmpty(){
    queue.enqueue(1);
    assertFalse(null,isQueueEmpty());
    queue.dequeue();
    assertTrue(null,isQueueEmpty());
  }

}
