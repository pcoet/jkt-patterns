package jkt.patterns.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class BagTest {
  Bag<String> bag;

  private void setUpStack() {
    bag = new Bag<>();
    bag.add("lions");
    bag.add("tigers");
    bag.add("bears");
  }

  public BagTest() {
    this.setUpStack();
  }

  @Test
  public void bagWithItemsIsNotEmpty() {
    Assertions.assertEquals(false, bag.isEmpty());
  }

  @Test
  public void bagHasExpectedSize() {
    Assertions.assertEquals(3, bag.size());
  }

  @Test
  public void canIterateOverItems() {
    Iterator<String> iterator = bag.iterator();
    Assertions.assertEquals(true, iterator.hasNext());
    Assertions.assertEquals("bears", iterator.next());
    Assertions.assertEquals("tigers", iterator.next());
    Assertions.assertEquals("lions", iterator.next());
  }
}
