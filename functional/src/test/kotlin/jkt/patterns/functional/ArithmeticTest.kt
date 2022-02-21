package jkt.patterns.functional

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArithmeticTest {

  @Test
  fun add() {
    assertEquals(4, jkt.patterns.functional.add(2, 2))
  }
}