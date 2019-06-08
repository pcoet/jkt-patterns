package pcoet.utils.data.structures;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.Test;

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
    assertThat(stack.isEmpty(), not(true)); 
  }

  @Test
  public void stackCanPopItems() {
    assertThat(stack.pop(), equalTo("bears"));
    assertThat(stack.pop(), equalTo("tigers"));
    assertThat(stack.pop(), equalTo("lions"));
  }

  @Test
  public void stackCanPushAndPopInts() {
    Stack<Integer> intStack = new Stack<>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);
    assertThat(intStack.pop(), equalTo(3));
    assertThat(intStack.pop(), equalTo(2));
    assertThat(intStack.pop(), equalTo(1));
  }
}