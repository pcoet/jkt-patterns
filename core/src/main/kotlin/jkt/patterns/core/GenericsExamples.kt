package jkt.patterns.core

// Example of a generic function. Takes a variable number of generic items,
// adds them to a list, and returns the list.
fun <T> buildList(vararg items: T): List<T> {
  val list = mutableListOf<T>()
  for (item in items) {
    list.add(item)
  }
  return list
}
