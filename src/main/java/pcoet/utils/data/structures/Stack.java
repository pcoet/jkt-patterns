package pcoet.utils.data.structures;

/**
 * A generic stack implemented on a linked list.
 * By definition, the stack is a collection with last-in, first out (LIFO) access.
 * For more information, see: https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
 */
public class Stack<T> {
  private Node top;
  private int counter;

  private class Node {
    T item;
    Node next;
  }

  public boolean isEmpty() {
    return top == null;
  }

  /**
   * Pushes an item onto the top of the stack.
   * @param item A generic item
   */
  public void push(T item) {
    Node oldTop = top;
    top = new Node();
    top.item = item;
    top.next = oldTop;
    counter++;
  }

  /**
   * Removes the top item from the stack and returns it.
   * @return The top item on the stack
   */
  public T pop() {
    T item = top.item;
    top = top.next;
    counter--;
    return item;
  }
}