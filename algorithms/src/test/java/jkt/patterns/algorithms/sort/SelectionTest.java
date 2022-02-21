package jkt.patterns.algorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionTest {
  @Test
  public void sortsIntegerArray() {
    Integer[] input = {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
    Integer[] expected = {2, 3, 5, 6, 7, 9, 10, 11, 12, 14};
    Selection.sort(input);
    Assertions.assertArrayEquals(expected, input);
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

    Selection.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }
}