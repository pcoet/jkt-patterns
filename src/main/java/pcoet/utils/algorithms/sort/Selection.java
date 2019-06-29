package pcoet.utils.algorithms.sort;

public class Selection {
  /**
   * Sort an array into increasing order.
   * @param a An array 
   */
  public static <T extends Comparable<T>> void sort(T[] a) {
    int n = a.length;
    for (int i = 0; i < n; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (less(a[j], a[min])) {
          min = j;
        }
      }
      exchange(a, i, min);
    }
  }

  private static <T extends Comparable<T>> boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }

  private static <T extends Comparable<T>> void exchange(T[] a, int i, int j) {
    T t = a[i];
    a[i] = a[j];
    a[j] = t;
  }
}