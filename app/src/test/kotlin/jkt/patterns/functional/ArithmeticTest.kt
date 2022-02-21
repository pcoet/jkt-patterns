package jkt.patterns.functional

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ArithmeticTest {

  @Test
  fun add() {
    assertEquals(4, add(2, 2))
  }
}