package jkt.patterns.algorithms

/**
 * Sorts the input array using selection sort. Translated from:
 * https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Selection.java
 * @param a the array to be sorted
 */
fun <T: Comparable<T>> selectionSort(a: Array<T>) {
  val n = a.size
  for (i in 0 until n) {
    var min = i
    for (j in i + 1 until n) {
      if (a[j] < a[min]) min = j
    }
    a.exch(i, min)
  }
}

/**
 * Sorts the input array using insertion sort. Translated from:
 * https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Insertion.java
 * @param a the array to be sorted
 */
fun <T: Comparable<T>> insertionSort(a: Array<T>) {
  val n = a.size
  for (i in 1 until n) {
    var j = i
    while (j > 0 && a[j] < a[j - 1]) {
      a.exch(j, j - 1)
      j--
    }
  }
}

// an extension function; see https://kotlinlang.org/docs/extensions.html
private fun <T: Comparable<T>> Array<T>.exch(i: Int, j: Int) {
  val temp = this[i]
  this[i] = this[j]
  this[j] = temp
}