package com.pcoet.patterns.data.structures

/**
 * Bag uses a singly linked list to represent a bag (or multiset) of generic items.
 * It supports insertion and iterating over the items in arbitrary order.
 */
class Bag<Item> : Iterable<Item> {
  // first item in the bag
  private var first: Node<Item>? = null
  // number of items in the bag
  private var n = 0

  // helper linked list class
  private class Node<Item> {
    var item: Item? = null
    var next: Node<Item>? = null
  }

  /**
   * Returns true if the bag is empty.
   *
   * @return `true` if this bag is empty; `false` otherwise
   */
  fun isEmpty(): Boolean {
    return first == null
  }

  /**
   * Returns the number of items in this bag.
   *
   * @return the number of items in this bag
   */
  fun size(): Int {
    return n
  }

  /**
   * Adds the item to this bag. This implementation adds each new item
   * as a new first element of the underlying linked list.
   *
   * @param item the item to add to this bag
   * @return the bag, to support method chaining
   */
  fun add(item: Item): Bag<Item> {
    val oldFirst = first
    first = Node()
    first?.item = item
    first?.next = oldFirst
    n++
    return this
  }

  /**
   * Returns an iterator that iterates over the items in this bag in arbitrary order.
   *
   * @return an iterator that iterates over the items in this bag in arbitrary order
   */
  override fun iterator(): Iterator<Item> {
    return LinkedIterator(first)
  }

  // note: the iterator doesn't support removing items; for that you need a MutableIterator
  private inner class LinkedIterator(private var current: Node<Item>?) :
    Iterator<Item> {
      override fun hasNext(): Boolean {
        return current != null
      }

      override fun next(): Item {
        if (!hasNext()) throw NoSuchElementException()
        val item: Item? = current?.item
        current = current?.next
        if (item == null) { throw Exception("Expected next item not to be null") }
        return item
      }
  }
}
