package jkt.patterns.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WidgetTest {
  Widget widget;

  @BeforeEach
  public void setUp() throws Exception {
    widget = new Widget("TestWidget", 0, 0, 20, 10);
  }

  @Test
  public void getName() {
    assertEquals("TestWidget", widget.getName());
  }

  @Test
  public void getUpperLeftPoint() {
    assertEquals(0, widget.getUpperLeftPoint().x);
    assertEquals(0, widget.getUpperLeftPoint().y);
  }

  @Test
  public void getUpperRightPoint() {
    assertEquals(20, widget.getUpperRightPoint().x);
    assertEquals(0, widget.getUpperRightPoint().y);
  }

  @Test
  public void getLowerRightPoint() {
    assertEquals(20, widget.getLowerRightPoint().x);
    assertEquals(-10, widget.getLowerLeftPoint().y);
  }

  @Test
  public void getLowerLeftPoint() {
    assertEquals(0, widget.getLowerLeftPoint().x);
    assertEquals(-10, widget.getLowerLeftPoint().y);
  }

  @Test
  public void move() {
    widget.move(15, 15);
    assertEquals(15, widget.getUpperLeftPoint().x);
    assertEquals(15, widget.getUpperLeftPoint().y);
    assertEquals(35, widget.getUpperRightPoint().x);
    assertEquals(15, widget.getUpperRightPoint().y);
    assertEquals(35, widget.getLowerRightPoint().x);
    assertEquals(5, widget.getLowerRightPoint().y);
    assertEquals(15, widget.getLowerLeftPoint().x);
    assertEquals(5, widget.getLowerLeftPoint().y);
  }

  @Test
  public void dragUpperEdge() {
    widget.dragUpperEdge(-5);
    assertEquals(0, widget.getUpperLeftPoint().x);
    assertEquals(-5, widget.getUpperLeftPoint().y);
    assertEquals(20, widget.getUpperRightPoint().x);
    assertEquals(-5, widget.getUpperRightPoint().y);
    assertEquals(20, widget.getLowerRightPoint().x);
    assertEquals(-10, widget.getLowerRightPoint().y);
    assertEquals(0, widget.getLowerLeftPoint().x);
    assertEquals(-10, widget.getLowerLeftPoint().y);
  }

  @Test
  public void dragRightEdge() {
    widget.dragRightEdge(10);
    assertEquals(0, widget.getUpperLeftPoint().x);
    assertEquals(0, widget.getUpperLeftPoint().y);
    assertEquals(30, widget.getUpperRightPoint().x);
    assertEquals(0, widget.getUpperRightPoint().y);
    assertEquals(30, widget.getLowerRightPoint().x);
    assertEquals(-10, widget.getLowerRightPoint().y);
    assertEquals(0, widget.getLowerLeftPoint().x);
    assertEquals(-10, widget.getLowerLeftPoint().y);
  }

  @Test
  public void dragLowerEdge() {
    widget.dragLowerEdge(-5);
    assertEquals(0, widget.getUpperLeftPoint().x);
    assertEquals(0, widget.getUpperLeftPoint().y);
    assertEquals(20, widget.getUpperRightPoint().x);
    assertEquals(0, widget.getUpperRightPoint().y);
    assertEquals(20, widget.getLowerRightPoint().x);
    assertEquals(-15, widget.getLowerRightPoint().y);
    assertEquals(0, widget.getLowerLeftPoint().x);
    assertEquals(-15, widget.getLowerLeftPoint().y);
  }

  @Test
  public void dragLeftEdge() {
    widget.dragLeftEdge(-5);
    assertEquals(-5, widget.getUpperLeftPoint().x);
    assertEquals(0, widget.getUpperLeftPoint().y);
    assertEquals(20, widget.getUpperRightPoint().x);
    assertEquals(0, widget.getUpperRightPoint().y);
    assertEquals(20, widget.getLowerRightPoint().x);
    assertEquals(-10, widget.getLowerRightPoint().y);
    assertEquals(-5, widget.getLowerLeftPoint().x);
    assertEquals(-10, widget.getLowerLeftPoint().y);
  }

  @Test
  public void testToString() {
    assertEquals("Widget{name=TestWidget, " +
        "upperLeftPoint=Point{x=0,y=0}, " +
        "upperRightPoint=Point{x=20,y=0}, " +
        "lowerRightPoint=Point{x=20,y=-10}, " +
        "lowerLeftPoint=Point{x=0,y=-10}}",
        widget.toString());
  }
}