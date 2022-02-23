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

/**
 * Sorts the input array using mergesort. Translated from:
 * https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Merge.java
 * @param a the array to be sorted
 */
fun <T: Comparable<T>> mergesort(a: Array<T>) {
  val aux = MutableList<T?>(a.size) { null }
  mergesort(a, aux, 0, a.size - 1)
}

private fun <T: Comparable<T>> mergesort(a: Array<T>, aux: MutableList<T?>, lo: Int, hi: Int) {
  if (hi <= lo) return
  val mid = lo + (hi - lo) / 2
  mergesort(a, aux, lo, mid)
  mergesort(a, aux, mid + 1, hi)
  merge(a, aux, lo, mid, hi)
}

private fun <T: Comparable<T>> merge(a: Array<T>, aux: MutableList<T?>, lo: Int, mid: Int, hi: Int) {
  for (k in lo..hi) {
    aux[k] = a[k]
  }

  var i = lo
  var j = mid + 1
  // in this loop, we use a number of non-null assertions (!!); we actually want
  // a NullPointerException if aux[i] is ever null (but it shouldn't be)
  for (k in lo..hi) {
    if (i > mid) a[k] = aux[j++]!!
    else if (j > hi) a[k] = aux[i++]!!
    else if (aux[j]!! < aux[i]!!) a[k] = aux[j++]!!
    else a[k] = aux[i++]!!
  }
}

/**
 * Sorts the input array using quicksort. Translated from:
 * https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Quick.java
 * @param a the array to sort
 */
fun <T: Comparable<T>> quicksort(a: Array<T>) {
  a.shuffle()
  quicksort(a, 0, a.size - 1)
}

private fun <T: Comparable<T>> quicksort(a: Array<T>, lo: Int, hi: Int) {
  if (hi <= lo) return
  val j = partition(a, lo, hi)
  quicksort(a, lo, j - 1)
  quicksort(a, j + 1, hi)
}

private fun <T: Comparable<T>> partition(a: Array<T>, lo: Int, hi: Int): Int {
  var i = lo
  var j = hi + 1
  val v = a[lo]
  while (true) {

    while (a[++i] < v) {
      if (i == hi) break
    }

    while (v < a[--j]) {
      if (j == lo) break
    }

    if (i >= j) break
    a.exch(i, j)
  }

  a.exch(lo, j)

  return j
}

// an extension function; see https://kotlinlang.org/docs/extensions.html
private fun <T: Comparable<T>> Array<T>.exch(i: Int, j: Int) {
  val temp = this[i]
  this[i] = this[j]
  this[j] = temp
}
