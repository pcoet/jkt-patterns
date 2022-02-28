package jkt.patterns.core

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GenericsExamplesKtTest {

  @Test
  fun buildList() {
    val expected = listOf(1, 1, 2, 3, 5, 8, 13)
    val result = buildList(1, 1, 2, 3, 5, 8, 13)
    assertEquals(expected, result)
  }
}