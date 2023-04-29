package stackAndQueue;


import org.testng.annotations.Test;

import java.util.Stack;


import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

  Stack<Integer> stack = new Stack<Integer>();
  @Test
  public void testPush() {

    stack.push(1);
    stack.push(2);
    stack.push(3);

    assertFalse(stack.isEmpty());
    assertEquals(3, stack.peek());
  }

  @Test
  public void testPop() throws Exception {

    stack.push(1);
    stack.push(2);
    stack.push(3);

    assertEquals(3, stack.pop());
    assertEquals(2, stack.pop());
    assertEquals(1, stack.pop());
    assertTrue(stack.isEmpty());

    try {
      stack.pop();
      fail("Expected an Exception to be thrown");
    } catch (Exception e) {
      assertEquals("Stack is empty", e.getMessage());
    }
  }

  @Test
  public void testPeek() throws Exception {

    stack.push(1);
    stack.push(2);
    stack.push(3);

    assertEquals(3, stack.peek());
    assertEquals(3, stack.peek());
    assertEquals(3, stack.pop());
    assertEquals(2, stack.peek());
  }

  @Test
  public void testIsEmpty() {


    assertTrue(stack.isEmpty());
    stack.push(1);
    assertFalse(stack.isEmpty());
    stack.pop();
    assertTrue(stack.isEmpty());
  }


}
