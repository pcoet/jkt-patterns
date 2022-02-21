package com.pcoet.patterns.algorithms.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeTest {
  @Test
  public void sortsIntegerArray() {
    Integer[] input = {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
    Integer[] expected = {2, 3, 5, 6, 7, 9, 10, 11, 12, 14};
    Merge.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  public void sortsStringArray() {
    String[] input = {
        "Kermit the Frog",
        "Fozzie Bear",
        "Sam Eagle",
        "Gonzo",
        "Miss Piggy",
        "Animal"
    };
    String[] expected = {
        "Animal",
        "Fozzie Bear",
        "Gonzo",
        "Kermit the Frog",
        "Miss Piggy",
        "Sam Eagle"
    };

    Merge.sort(input);
    assertArrayEquals(expected, input);
  }
}