package pcoet.utils.algorithms;

public class Quicksort {
  /**
   * Sorts an array of integers in place.
   * @param arr The array to be sorted
   * Quicksort has an average runtime complexity of O(n log n).
   * For more information, see: https://en.wikipedia.org/wiki/Quicksort
   */
  public static void sort(int[] arr) {
    int l = 0;
    int r = arr.length - 1;
    Quicksort.quicksort(arr, l, r);
  }

  /**
   * @param arr The array to be sorted
   * @param l Index of leftmost item
   * @param r Index of rightmost item
   */
  private static void quicksort(int[] arr, int l, int r) {
    if (l >= r) {
      return;
    }
  
    int p = partition(arr, l, r);
    Quicksort.quicksort(arr, l, p - 1);
    Quicksort.quicksort(arr, p + 1, r);
  }

  private static int partition(int[] arr, int l, int r) {
    int q = l;
    // iterate through the array (or sub-array) from left to right
    for (int u = l; u <= r - 1; u++) {
      if (arr[u] <= arr[r]) {
        int tempInner = arr[q];
        arr[q] = arr[u];
        arr[u] = tempInner;
        q++;
      }
    }
    int tempOuter = arr[q];
    arr[q] = arr[r];
    arr[r] = tempOuter;
  
    return q;
  }
}