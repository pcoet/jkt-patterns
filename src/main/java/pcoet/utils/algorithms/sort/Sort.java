package pcoet.utils.algorithms.sort;

class Sort {
  protected static <T extends Comparable<T>> boolean less(T v, T w) {
    return v.compareTo(w) < 0;
  }

  protected static <T extends Comparable<T>> void exchange(T[] arr, int i, int j) {
    T t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }
}
