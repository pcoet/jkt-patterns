package com.pcoet.patterns.data.structures

import org.junit.Test

import org.junit.Assert.*

class BagTest {

  @Test
  fun isEmpty() {
    val bag = Bag<Int>()
    assertEquals(true, bag.isEmpty())
    bag.add(1)
    assertEquals(false, bag.isEmpty())
  }

  @Test
  fun size() {
    val bag = Bag<String>()
    assertEquals(0, bag.size())
    bag.add("abc")
    assertEquals(1, bag.size())
  }

  @Test
  fun add() {
    val bag = Bag<Int>()
    bag.add(1).add(1).add(2).add(3).add(5).add(8).add(13)
    assertEquals(7, bag.size())
  }

  /**
   * For simplicity, this test assumes an order to the iteration, but that is an implementation detail.
   */
  @Test
  operator fun iterator() {
    val fibs = listOf(1, 1, 2, 3, 5, 8, 13)
    val bag = Bag<Int>().add(13).add(8).add(5).add(3).add(2).add(1).add(1)
    var i = 0
    bag.forEach {
      assertEquals(fibs[i], it)
      i++
    }
  }
}