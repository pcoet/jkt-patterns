package pcoet.utils.algorithms.sort;

import java.util.Random;

/**
 * A randomized implementation of quicksort.
 * Sorts the input array in place; can be expected to run in O(n log n) time.
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
    int i = lo;
    int j = hi + 1;
    Comparable<T> v = arr[lo];
    while (true) {                   // loop forever
      while (less(arr[++i], v)) {    // scan to the right
        if (i == hi) {
          break;
        }
      }
      while (less(v, arr[--j])) {    // scan to the left
        if (j == lo) {
          break;
        }
      }
      if (i >= j) {
        break;
      }
      exchange(arr, i, j);
    }
    exchange(arr, lo, j);
    return j;
  }

  /****************************** Helper functions below. ******************************/

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  private static void exchange(Object[] arr, int i, int j) {
    Object temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  /**
   * Rearranges the elements of the specified array in uniformly random order.
   *
   * @param arr the array to shuffle
   */
  public static void shuffle(Object[] arr) {
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