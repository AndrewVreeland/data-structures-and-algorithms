package stackAndQueue;


import codechallenges.stackAndQueue.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.*;


public class StackTest {

  @Test
  public void testPush() throws Exception {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    Assertions.assertFalse(stack.isEmpty());
    Assertions.assertEquals(3, stack.peek());
  }
//
  @Test
  public void testPop() throws Exception {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    Assertions.assertEquals(3, stack.pop());
    Assertions.assertEquals(2, stack.pop());
    Assertions.assertEquals(1, stack.pop());
    Assertions.assertTrue(stack.isEmpty());

    try {
      stack.pop();
      Assertions.fail("Expected an Exception to be thrown");
    } catch (Exception e) {
      Assertions.assertEquals("Stack is empty", e.getMessage());
    }
  }

  @Test
  public void testPeek() throws Exception {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    Assertions.assertEquals(3, stack.peek());
    Assertions.assertEquals(3, stack.peek());
    Assertions.assertEquals(3, stack.pop());
    Assertions.assertEquals(2, stack.peek());
  }
//
  @Test
  public void testIsEmpty() throws Exception {
    Stack stack = new Stack();

    Assertions.assertTrue(stack.isEmpty());
    stack.push(1);
    Assertions.assertFalse(stack.isEmpty());
    stack.pop();
    Assertions.assertTrue(stack.isEmpty());
  }


}
