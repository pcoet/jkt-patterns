package pcoet.patterns.algorithms.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionTest {
  @Test
  public void sortsIntegerArray() {
    Integer[] input = {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
    Integer[] expected = {2, 3, 5, 6, 7, 9, 10, 11, 12, 14};
    Insertion.sort(input);
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

    Insertion.sort(input);
    assertArrayEquals(expected, input);
  }
}
