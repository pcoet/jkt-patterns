package jkt.patterns.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
  Stack<String> stack;

  private void setUpStack() {
    stack = new Stack<>();
    stack.push("lions");
    stack.push("tigers");
    stack.push("bears");
  }

  public StackTest() {
    this.setUpStack();
  }

  @Test
  public void stackWithItemsIsNotEmpty() {
    assertEquals(false, stack.isEmpty());
  }

  @Test
  public void stackHasExpectedSize() {
    assertEquals(3, stack.size());
  }

  @Test
  public void stackCanPopItems() {
    assertEquals("bears", stack.pop());
    assertEquals("tigers", stack.pop());
    assertEquals("lions", stack.pop());
  }

  @Test
  public void stackCanPushAndPopInts() {
    Stack<Integer> intStack = new Stack<>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    assertEquals(3, intStack.pop());
    assertEquals(2, intStack.pop());
    assertEquals(1, intStack.pop());
  }
}