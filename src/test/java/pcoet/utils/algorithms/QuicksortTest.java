package pcoet.utils.algorithms;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuicksortTest {
  @Test
  public void qucksortReturnsExpectedString() {
    int[] input = {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
    int[] expected = {2, 3, 5, 6, 7, 9, 10, 11, 12, 14};
    Quicksort.sort(input);
    assertArrayEquals(expected, input);
  }
}