package com.pcoet.patterns.data.structures

import org.junit.Test

import org.junit.Assert.*

class BagTest {

  @Test
  fun isEmpty() {
    val bag = Bag<Int>()
    assertEquals(true, bag.isEmpty())
  }

  @Test
  fun size() {
    val bag = Bag<String>()
    assertEquals(0, bag.size())
  }

  @Test
  fun add() {
  }

  @Test
  operator fun iterator() {
  }
}