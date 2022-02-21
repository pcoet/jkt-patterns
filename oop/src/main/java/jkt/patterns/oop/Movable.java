package jkt.patterns.oop;

/**
 * A rectangular object (e.g. a UI box) that can be moved along the x and y axes of a coordinate plane.
 */
public interface Movable {
  /**
   * Moves an object `distX` units on the x-axis and `distY` units on the y-axis.
   */
  public void move(int distX, int distY);
}
