package jkt.patterns.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
  Queue<String> queue;

  private void setUpStack() {
    queue = new Queue<>();
    queue.enqueue("lions");
    queue.enqueue("tigers");
    queue.enqueue("bears");
  }

  public QueueTest() {
    this.setUpStack();
  }

  @Test
  public void queueWithItemsIsNotEmpty() {
    assertEquals(false, queue.isEmpty());
  }

  @Test
  public void queueHasExpectedSize() {
    assertEquals(3, queue.size());
  }

  @Test
  public void queueCanDequeueItems() {
    assertEquals("lions", queue.dequeue());
    assertEquals("tigers", queue.dequeue());
    assertEquals("bears", queue.dequeue());
    assertEquals(true, queue.isEmpty());
  }

  @Test
  public void queueCanEnqueueAndDequeueInts() {
    Queue<Integer> intQueue = new Queue<>();
    intQueue.enqueue(1);
    intQueue.enqueue(2);
    intQueue.enqueue(3);
    assertEquals(1, intQueue.dequeue());
    assertEquals(2, intQueue.dequeue());
    assertEquals(3, intQueue.dequeue());
  }
}