package jkt.patterns.oop;

/**
 * A rectangular object (e.g. a UI box) that can be resized along the x and y axes of a coordinate plane.
 */
public interface Resizable {
  /**
   * Moves the upper edge `y` units on the y-axis.
   */
  public void dragUpperEdge(int y);

  /**
   * Moves the right edge `x` units on the x-axis.
   */
  public void dragRightEdge(int x);

  /**
   * Moves the lower edge `y` units on the y-axis.
   */
  public void dragLowerEdge(int y);

  /**
   * Moves the left edge `x` units on the x-axis.
   */
  public void dragLeftEdge(int x);
}
