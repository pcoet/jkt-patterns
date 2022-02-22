package jkt.patterns.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SortTest {
  private fun getInputIntArr() = arrayOf(34, 3, 21, 1, 0, 5, 55, 1, 13, 2, 8)
  private fun getExpectedIntArr() = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
  private fun getInputStrArr() = arrayOf("fff", "hhh", "aaa", "ggg", "eee", "bbb", "ddd", "jjj", "iii", "ccc")
  private fun getExpectedStrArr() = arrayOf("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii", "jjj")

  @Test
  fun selectionSort() {
    val inputIntArr = getInputIntArr()
    selectionSort(inputIntArr)
    assertArrayEquals(getExpectedIntArr(), inputIntArr)

    val inputStr = getInputStrArr()
    selectionSort(inputStr)
    assertArrayEquals(getExpectedStrArr(), inputStr)
  }

  @Test
  fun insertionSort() {
    val inputIntArr = getInputIntArr()
    insertionSort(inputIntArr)
    assertArrayEquals(getExpectedIntArr(), inputIntArr)

    val inputStr = getInputStrArr()
    insertionSort(inputStr)
    assertArrayEquals(getExpectedStrArr(), inputStr)
  }
}