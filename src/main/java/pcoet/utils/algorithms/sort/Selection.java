package pcoet.utils.algorithms.sort;

public class Selection {
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

  private static <T extends Comparable<T>> boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }

  private static <T extends Comparable<T>> void exchange(T[] arr, int i, int j) {
    T t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }
}
