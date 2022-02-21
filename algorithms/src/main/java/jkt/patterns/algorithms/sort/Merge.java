package jkt.patterns.algorithms.sort;

/**
 * An implementation of merge sort, which runs in O(n log n).
 * To learn more, see: https://en.wikipedia.org/wiki/Merge_sort
 */

public class Merge {
  /**
   * Sorts the array in ascending order, in place.
   * @param arr the array to be sorted
   */
  @SuppressWarnings("unchecked")
  public static void sort(Comparable[] arr) {
    Comparable[] temp = new Comparable[arr.length];
    sort(arr, temp, 0, arr.length - 1);
  }

  private static <T extends Comparable<T>> void sort(T[] arr, T[] temp, int lo, int hi) {
    if (hi <= lo) {
      return;
    }
    int mid = lo + (hi - lo) / 2;
    sort(arr, temp, lo, mid);          // sort left array
    sort(arr, temp, mid + 1, hi);  // sort right array
    merge(arr, temp, lo, mid, hi);
  }

  private static <T extends Comparable<T>> void merge(T[] arr, T[] temp, int lo, int mid, int hi) {
    for (int k = lo; k <= hi; k++) {
      temp[k] = arr[k];                       // copy items from arr into temp
    }

    int i = lo;                               // i indexes left half
    int j = mid + 1;                          // j indexes right half

    for (int k = lo; k <= hi; k++) {          // loop through items, merging back into arr
      if (i > mid) {                          // left half is empty ...
        arr[k] = temp[j++];                   // ... get an item from the right
      } else if (j > hi) {                    // right half is empty ...
        arr[k] = temp[i++];                   // ... get an item from the left
      } else if (less(temp[j], temp[i])) {    // right item is less ...
        arr[k] = temp[j++];                   // ... get item from the right
      } else {
        arr[k] = temp[i++];                   // get an item from the left
      }
    }
  }

  private static <T extends Comparable<T>> boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }
}
