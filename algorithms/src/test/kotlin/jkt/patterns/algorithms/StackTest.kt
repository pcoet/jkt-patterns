package jkt.patterns.algorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StackTest {

  @Test
  fun testIsEmpty() {
    val stack = Stack<Int>()
    assertEquals(true, stack.isEmpty())
    stack.push(123)
    assertEquals(false, stack.isEmpty())
  }

  @Test
  fun testSize() {
    val stack = Stack<Int>()
    assertEquals(0, stack.size())
    stack.push(123)
    assertEquals(1, stack.size())
  }

  @Test
  fun testPush() {
    val stack = Stack<String>().push("aaa").push("bbb").push("ccc")
    assertEquals(3, stack.size())
  }

  @Test
  fun testPop() {
    val stack = Stack<String>()
    assertThrows(NoSuchElementException::class.java) {
      stack.pop() // this is an empty stack
    }
    stack.push("aaa").push("bbb").push("ccc")
    assertEquals("ccc", stack.pop())
    assertEquals(2, stack.size())

    assertEquals("bbb", stack.pop())
    assertEquals(1, stack.size())

    assertEquals("aaa", stack.pop())
    assertEquals(0, stack.size())
    assertEquals(true, stack.isEmpty())
  }

  @Test
  fun testPeek() {
    val stack = Stack<String>()
    assertThrows(NoSuchElementException::class.java) {
      stack.peek() // this is an empty stack
    }
    stack.push("aaa").push("bbb").push("ccc")
    val topItem = stack.peek()
    assertEquals("ccc", topItem)
    assertEquals(3, stack.size())
  }

  @Test
  fun testIterator() {
    val stack = Stack<String>().push("aaa").push("bbb").push("ccc")
    val expected = listOf<String>("ccc", "bbb", "aaa")
    val actual = mutableListOf<String>()
    stack.forEach { actual.add(it) }
    assertEquals(expected, actual)
  }

  @Test
  fun testToString() {
    val strStack = Stack<String>().push("aaa").push("bbb").push("ccc")
    assertEquals("ccc bbb aaa", strStack.toString())
    val intStack = Stack<Int>().push(3).push(2).push(1)
    assertEquals("1 2 3", intStack.toString())
  }
}
