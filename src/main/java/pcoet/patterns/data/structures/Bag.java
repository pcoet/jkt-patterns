package pcoet.patterns.data.structures;

import java.util.Iterator;

/**
 * A generic bag implemented with a linked list.
 * The bag is LIFO, but this is an implementation detail.
 */
public class Bag<T> implements Iterable<T> {
  private Node first;
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
   * Adds an item to the bag.
   */
  public void add(T item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
    counter++;
  }

  public Iterator<T> iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator<T> {
    private Node current = first;

    public boolean hasNext() {
      return current != null;
    }

    public void remove() {
    }

    public T next() {
      T item = current.item;
      current = current.next;
      return item;
    }
  }
}