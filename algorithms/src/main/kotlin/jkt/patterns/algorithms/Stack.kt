package jkt.patterns.algorithms

import java.lang.StringBuilder

/**
 * A generic last in, first out (LIFO) stack. The top item on the stack is the last in,
 * i.e. the most recently added.
 *
 * @param Item The type of element on the stack.
 */
class Stack<Item> : Iterable<Item> {
  private var first: Node<Item>? = null
  private var n: Int = 0

  private class Node<Item> {
    var item: Item? = null
    var next: Node<Item>? = null
  }

  /**
   * Returns true if there are no items on the stack; false otherwise.
   */
  fun isEmpty(): Boolean {
    return first == null
  }

  /**
   * Returns the number of items on the stack.
   */
  fun size() = n

  /**
   * Adds an item to the stack.
   *
   * @return Returns the stack.
   */
  fun push(item: Item) : Stack<Item> {
    val oldFirst = first
    first = Node()
    first?.item = item
    first?.next = oldFirst
    n++
    return this
  }

  /**
   * Removes the top item from the stack. Throws an exception if the stack is empty.
   *
   * @throws NoSuchElementException if the stack is empty
   * @return Returns the top item.
   */
  fun pop(): Item {
    if(isEmpty()) throw NoSuchElementException("The stack is empty")
    val item = first?.item
    first = first?.next
    n--
    return item!! // we've passed the isEmpty test, so this should never be null
  }

  /**
   * Returns the top item on the stack, but does not remove the item.
   */
  fun peek(): Item {
    if(isEmpty()) throw NoSuchElementException("The stack is empty")
    return first!!.item!! // we've passed the isEmpty test, so this should never be null
  }

  override fun toString(): String {
    val sb = StringBuilder()
    for (item in this) {
      sb.append(item)
      sb.append(' ')
    }
    return sb.toString().trimEnd()
  }

  override fun iterator(): Iterator<Item> {
    return LinkedIterator(first)
  }

  private class LinkedIterator<Item>(first: Node<Item>?) : Iterator<Item> {
    var current = first

    override fun hasNext(): Boolean {
      return current != null
    }

    override fun next(): Item {
      if (!hasNext()) {
        throw NoSuchElementException()
      }
      val item = current?.item
      current = current?.next
      return item!!
    }
  }
}
