package jkt.patterns.oop;

/**
 * An x coordinate and a y coordinate in a two-dimensional plane.
 */
public class Point {
  public final int x;
  public final int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point{x=" + x + ",y=" + y + "}";
  }
}
