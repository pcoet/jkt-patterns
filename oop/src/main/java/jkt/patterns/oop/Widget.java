package jkt.patterns.oop;

/**
 * A mock UI element. A Widget is a movable, resizable 2D box (i.e. rectangle) defined by four vertices and four edges.
 * Each vertex is a corner of the box (upper left, upper right, lower right, lower left) and is
 * represented by a Point. The edges are not explicitly represented on the class,
 * but are implied by the drag*Edge methods.
 *
 * Demonstrates: implementing interfaces, getters, overriding toString.
 */
public class Widget implements Movable, Resizable {
  private final String name;
  private Point upperLeftPoint;
  private Point upperRightPoint;
  private Point lowerRightPoint;
  private Point lowerLeftPoint;

  /**
   * Widget constructor
   * @param upperLeftX The x value of the upper-left corner of the Widget
   * @param upperLeftY The y value of the upper-left corner of the Widget
   * @param width The width of the widget
   * @param height the height of the widget
   */
  Widget(String name, int upperLeftX, int upperLeftY, int width, int height) {
    this.name = name;
    this.upperLeftPoint = new Point(upperLeftX, upperLeftY);
    this.upperRightPoint = new Point(upperLeftX + width, upperLeftY);
    this.lowerRightPoint = new Point(upperLeftX + width, upperLeftY - height);
    this.lowerLeftPoint = new Point(upperLeftX, upperLeftY - height);
  }

  /**
   * Gets the name of the Widget.
   * @return the name of the Widget
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the Point associated with the upper-left corner of the Widget.
   * @return the Point associated with the upper-left corner of the Widget
   */
  public Point getUpperLeftPoint() {
    return this.upperLeftPoint;
  }

  /**
   * Gets the Point associated with the upper-right corner of the Widget.
   * @return the Point associated with the upper-right corner of the Widget
   */
  public Point getUpperRightPoint() {
    return this.upperRightPoint;
  }

  /**
   * Gets the Point associated with the lower-right corner of the Widget.
   * @return the Point associated with the lower-right corner of the Widget
   */
  public Point getLowerRightPoint() {
    return this.lowerRightPoint;
  }

  /**
   * Gets the Point associated with the lower-left corner of the Widget.
   * @return the Point associated with the lower-left corner of the Widget
   */
  public Point getLowerLeftPoint() {
    return this.lowerLeftPoint;
  }

  @Override
  public void move(int distX, int distY) {
    this.upperLeftPoint = new Point(this.upperLeftPoint.x + distX, this.upperLeftPoint.y + distY);
    this.upperRightPoint = new Point(this.upperRightPoint.x + distX, this.upperRightPoint.y + distY);
    this.lowerRightPoint = new Point(this.lowerRightPoint.x + distX, this.lowerRightPoint.y + distY);
    this.lowerLeftPoint = new Point(this.lowerLeftPoint.x + distX, this.lowerLeftPoint.y + distY);
  }

  @Override
  public void dragUpperEdge(int y) {
    this.upperLeftPoint = new Point(this.upperLeftPoint.x, this.upperLeftPoint.y + y);
    this.upperRightPoint = new Point(this.upperRightPoint.x, this.upperRightPoint.y + y);
  }

  @Override
  public void dragRightEdge(int x) {
    this.upperRightPoint = new Point(this.upperRightPoint.x + x, this.upperRightPoint.y);
    this.lowerRightPoint = new Point(this.lowerRightPoint.x + x, this.lowerRightPoint.y);
  }

  @Override
  public void dragLowerEdge(int y) {
    this.lowerLeftPoint = new Point(this.lowerLeftPoint.x, this.lowerLeftPoint.y + y);
    this.lowerRightPoint = new Point(this.lowerRightPoint.x, this.lowerRightPoint.y + y);
  }

  @Override
  public void dragLeftEdge(int x) {
    this.upperLeftPoint = new Point(this.upperLeftPoint.x + x, this.upperLeftPoint.y);
    this.lowerLeftPoint = new Point(this.lowerLeftPoint.x + x, this.lowerLeftPoint.y);
  }

  @Override
  public String toString() {
    return "Widget{" +
        "name=" + name +
        ", upperLeftPoint=" + upperLeftPoint +
        ", upperRightPoint=" + upperRightPoint +
        ", lowerRightPoint=" + lowerRightPoint +
        ", lowerLeftPoint=" + lowerLeftPoint +
        '}';
  }
}
