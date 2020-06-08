package pcoet.patterns.data.structures;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

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
    assertThat(bag.isEmpty(), not(true));
  }

  @Test
  public void bagHasExpectedSize() {
    assertThat(bag.size(), equalTo(3));
  }

  @Test
  public void canIterateOverItems() {
    Iterator<String> iterator = bag.iterator();
    assertThat(iterator.hasNext(), equalTo(true));
    assertThat(iterator.next(), equalTo("bears"));
    assertThat(iterator.next(), equalTo("tigers"));
    assertThat(iterator.next(), equalTo("lions"));
  }
}
