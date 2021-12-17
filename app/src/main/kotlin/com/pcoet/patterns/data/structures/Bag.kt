package com.pcoet.patterns.data.structures

/**
 * Bag represents a bag (or multiset) of generic items using a singly linked list.
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
   * Adds the item to this bag.
   *
   * @param  item the item to add to this bag
   */
  fun add(item: Item) {
    val oldfirst = first
    first = Node()
    first!!.item = item
    first!!.next = oldfirst
    n++
  }

  /**
   * Returns an iterator that iterates over the items in this bag in arbitrary order.
   *
   * @return an iterator that iterates over the items in this bag in arbitrary order
   */
  override fun iterator(): Iterator<Item> {
    return LinkedIterator(first)
  }

  // an iterator, doesn't implement remove() since it's optional
  private inner class LinkedIterator(private var current: Node<Item>?) :
    MutableIterator<Item> {
    override fun hasNext(): Boolean {
      return current != null
    }

    override fun remove() {
      throw UnsupportedOperationException()
    }

    override fun next(): Item {
      if (!hasNext()) throw NoSuchElementException()
      val item: Item = current!!.item!!
      current = current!!.next
      return item
    }
  }
}

