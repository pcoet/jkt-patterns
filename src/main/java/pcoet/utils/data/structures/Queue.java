package pcoet.utils.data.structures;

/**
 * A first in, first out generic collection implemented with a linked list.
 * For more information, see: https://en.wikipedia.org/wiki/Queue_(abstract_data_type)
 */
public class Queue<T> {
  private Node first;
  private Node last;
  private int counter;

  private class Node {
    T item;
    Node next;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public int size() {
    return counter;
  }

  /**
   * Adds an item to the end of the list.
   */
  public void enqueue(T item) {
    Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    if (isEmpty()) {
      first = last;
    } else {
      oldLast.next = last;
    }
    counter++;
  }

  /**
   * Removes and returns an item from the front of the list.
   */
  public T dequeue() {
    final T item = first.item;
    first = first.next;
    counter--;
    if (isEmpty()) {
      last = null;
    }
    return item;
  }
}