package pcoet.utils.data.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A first in, first out generic collection implemented with a linked list.
 * For more information, see: https://en.wikipedia.org/wiki/Queue_(abstract_data_type)
 */
public class Queue<T> implements Iterable<T> {
  private Node<T> first;
  private Node<T> last;
  private int counter;

  private class Node<I> {
    I item;
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
    last = new Node<>();
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
  @SuppressWarnings("unchecked")
  public T dequeue() {
    final T item = first.item;
    first = first.next;
    counter--;
    if (isEmpty()) {
      last = null;
    }
    return item;
  }

  /**
   * Implements iterator method of Iterable interface.
   */
  public Iterator<T> iterator()  {
    return new ListIterator(first);
  }

  @SuppressWarnings("unchecked")
  private class ListIterator implements Iterator<T> {
    private Node<T> current;

    public ListIterator(Node<T> first) {
      current = first;
    }

    public boolean hasNext() {
      return current != null;
    }

    public T next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      T item = current.item;
      current = current.next;
      return item;
    }
  }
}