package jkt.patterns.algorithms

/**
 * Represents a bag data structure. Translated from:
 * https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Bag.java
 */
class Bag<Item> : Iterable<Item> {
  private var first: Node<Item>? = null
  private var n = 0

  // internal linked list
  private class Node<Item> {
    var item: Item? = null
    var next: Node<Item>? = null
  }

  val isEmpty: Boolean
    get() = first == null

  fun size(): Int {
    return n
  }

  fun add(item: Item): Bag<Item> {
    val oldFirst = first
    first = Node()
    first!!.item = item
    first!!.next = oldFirst
    n++
    return this
  }

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
      val item = current?.item
      current = current?.next
      if (item == null) {
        throw NoSuchElementException()
      }
      return item
    }
  }
}