package com.pcoet.patterns.data.structures;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

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
    assertThat(queue.isEmpty(), not(true));
  }

  @Test
  public void queueHasExpectedSize() {
    assertThat(queue.size(), equalTo(3));
  }

  @Test
  public void queueCanDequeueItems() {
    assertThat(queue.dequeue(), equalTo("lions"));
    assertThat(queue.dequeue(), equalTo("tigers"));
    assertThat(queue.dequeue(), equalTo("bears"));
    assertThat(queue.isEmpty(), equalTo(true));
  }

  @Test
  public void queueCanEnqueueAndDequeueInts() {
    Queue<Integer> intQueue = new Queue<>();
    intQueue.enqueue(1);
    intQueue.enqueue(2);
    intQueue.enqueue(3);
    assertThat(intQueue.dequeue(), equalTo(1));
    assertThat(intQueue.dequeue(), equalTo(2));
    assertThat(intQueue.dequeue(), equalTo(3));
  }
}