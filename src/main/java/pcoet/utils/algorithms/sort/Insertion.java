package pcoet.utils.algorithms.sort;

public class Insertion extends Sort {
  /**
   * Sorts an array into increasing order, in place. Runs in O(n2) time.
   * For more information, see https://en.wikipedia.org/wiki/Insertion_sort
   * @param arr An array
   */
  public static <T extends Comparable<T>> void sort(T[] arr) {
    int arrLength = arr.length;
    for (int i = 1; i < arrLength; i++) {
      for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
        exchange(arr, j, j - 1);
      }
    }
  }
}
