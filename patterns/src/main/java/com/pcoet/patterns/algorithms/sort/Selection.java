package com.pcoet.patterns.algorithms.sort;

public class Selection extends Sort {
  /**
   * Sorts an array into increasing order. Runs in O(n2) time.
   * For more information, see https://en.wikipedia.org/wiki/Selection_sort
   * @param arr An array
   */
  public static <T extends Comparable<T>> void sort(T[] arr) {
    int arrLength = arr.length;
    for (int i = 0; i < arrLength; i++) {
      int min = i;
      for (int j = i + 1; j < arrLength; j++) {
        if (less(arr[j], arr[min])) {
          min = j;
        }
      }
      exchange(arr, i, min);
    }
  }

}
