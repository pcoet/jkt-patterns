package jkt.patterns.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BagTest {

  @Test
  fun isEmpty() {
    val bag = Bag<Int>()
    assertEquals(true, bag.isEmpty)
    bag.add(11)
    assertEquals(false, bag.isEmpty)
  }

  @Test
  fun size() {
    val bag = Bag<Int>()
    assertEquals(0, bag.size())
    assertEquals(3, bag.add(11).add(13).add(17).size())
  }

  @Test
  fun add() {
    val bag = Bag<String>()
    assertEquals(0, bag.size())
    assertEquals(3, bag.add("aaa").add("bbb").add("ccc").size())
  }

  @Test
  operator fun iterator() {
    val bag = Bag<Int>().add(3).add(5).add(7).add(11).add(13).add(17).add(19)
    val expected = listOf(3, 5, 7, 11, 13, 17, 19)
    val result = mutableListOf<Int>()
    bag.forEach { result.add(it) }
    assertEquals(expected.sorted(), result.sorted())
  }
}