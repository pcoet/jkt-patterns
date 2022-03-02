package jkt.patterns.core

import jkt.patterns.oop.Bird
import jkt.patterns.oop.Goose
import jkt.patterns.oop.Flock

// Example of a generic function. Takes a variable number of generic items,
// adds them to a list, and returns the list. You can also declare an upper
// bound for a function. For examples, see jkt.patterns.algorithms.Sort.
fun <T> buildList(vararg items: T): List<T> {
  val list = mutableListOf<T>()
  for (item in items) {
    list.add(item)
  }
  return list
}

// Example of a function that uses the `out` keyword to make a type parameter covariant.
// `Flock` is covariant in type parameter `Bird`, meaning that you can use a subtype, e.g.
// `Flock<Goose>`
fun listenToBirds(flock: Flock<out Bird>) {
  for (bird in flock) {
    bird.call()
  }
}

fun listenToGeese(geese: Flock<Goose>) {
  listenToBirds(geese) // here's the covariant in action
}
