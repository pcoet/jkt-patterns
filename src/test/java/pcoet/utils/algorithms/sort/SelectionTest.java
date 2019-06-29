package pcoet.utils.algorithms.sort;

import static org.junit.Assert.*;
import org.junit.Test;

public class SelectionTest {
  @Test
  public void selectionSortsIntegerArray() {
    Integer[] input = {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
    Integer[] expected = {2, 3, 5, 6, 7, 9, 10, 11, 12, 14};
    Selection.<Integer>sort(input);
    assertArrayEquals(expected, input);
  }
}