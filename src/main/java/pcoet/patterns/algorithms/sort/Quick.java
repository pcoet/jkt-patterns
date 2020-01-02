package pcoet.patterns.algorithms.sort;

import java.util.Random;

/**
 * A randomized implementation of quicksort.
 * Sorts the input array in place, with an average runtime complexity of O(n log n).
 * To learn more, see: https://en.wikipedia.org/wiki/Quicksort
 */

public class Quick {
  public static <T extends Comparable<T>> void sort(T[] arr) {
    shuffle(arr);
    sort(arr, 0, arr.length - 1);
  }

  private static <T extends Comparable<T>> void sort(T[] arr, int lo, int hi) {
    if (hi <= lo) {
      return;
    }
    int q = partition(arr, lo, hi);
    sort(arr, lo, q - 1);
    sort(arr, q + 1, hi);
  }

  private static <T extends Comparable<T>> int partition(T[] arr, int lo, int hi) {
    int q = lo;
    for (int i = lo; i < hi; i++) {
      if (less(arr[i], arr[hi])) {
        T tempInner = arr[q];
        arr[q] = arr[i];
        arr[i] = tempInner;
        q++;
      }
    }
    T tempOuter = arr[q];
    arr[q] = arr[hi];
    arr[hi] = tempOuter;

    return q;
  }

  /****************************** Helper functions below. ******************************/

  private static <T extends Comparable<T>> boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }

  /**
   * Rearranges the elements of the specified array in uniformly random order.
   *
   * @param arr the array to shuffle
   */

  private static void shuffle(Object[] arr) {
    int arrLength = arr.length;
    for (int i = 0; i < arrLength; i++) {
      long seed = System.currentTimeMillis();
      Random random = new Random(seed);
      int r = i + random.nextInt(arrLength - i);
      Object temp = arr[i];
      arr[i] = arr[r];
      arr[r] = temp;
    }
  }
}