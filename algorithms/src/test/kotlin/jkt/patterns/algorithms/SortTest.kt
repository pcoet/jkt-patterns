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

    val inputStrArr = getInputStrArr()
    selectionSort(inputStrArr)
    assertArrayEquals(getExpectedStrArr(), inputStrArr)

    val inputCharArr = arrayOf('s', 'e', 'l', 'e', 'c', 't')
    val expectedCharArr = arrayOf('c', 'e', 'e', 'l', 's', 't')
    selectionSort(inputCharArr)
    assertArrayEquals(expectedCharArr, inputCharArr)
  }

  @Test
  fun insertionSort() {
    val inputIntArr = getInputIntArr()
    insertionSort(inputIntArr)
    assertArrayEquals(getExpectedIntArr(), inputIntArr)

    val inputStr = getInputStrArr()
    insertionSort(inputStr)
    assertArrayEquals(getExpectedStrArr(), inputStr)

    val inputCharArr = arrayOf('i', 'n', 's', 'e', 'r', 't')
    val expectedCharArr = arrayOf('e', 'i', 'n', 'r', 's', 't')
    insertionSort(inputCharArr)
    assertArrayEquals(expectedCharArr, inputCharArr)
  }

  @Test
  fun mergesort() {
    val inputIntArr = getInputIntArr()
    mergesort(inputIntArr)
    assertArrayEquals(getExpectedIntArr(), inputIntArr)

    val inputStr = getInputStrArr()
    mergesort(inputStr)
    assertArrayEquals(getExpectedStrArr(), inputStr)

    val inputCharArr = arrayOf('m', 'e', 'r', 'g', 'e')
    val expectedCharArr = arrayOf('e', 'e', 'g', 'm', 'r')
    mergesort(inputCharArr)
    assertArrayEquals(expectedCharArr, inputCharArr)
  }

  @Test
  fun quicksort() {
    val inputIntArr = getInputIntArr()
    quicksort(inputIntArr)
    assertArrayEquals(getExpectedIntArr(), inputIntArr)

    val inputStr = getInputStrArr()
    quicksort(inputStr)
    assertArrayEquals(getExpectedStrArr(), inputStr)

    val inputCharArr = arrayOf('q', 'u', 'i', 'c', 'k')
    val expectedCharArr = arrayOf('c', 'i', 'k', 'q', 'u')
    quicksort(inputCharArr)
    assertArrayEquals(expectedCharArr, inputCharArr)
  }
}