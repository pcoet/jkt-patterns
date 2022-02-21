package jkt.patterns.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GadgetTest {
  Gadget gadget;

  @BeforeEach
  public void setUp() {
    gadget = new Gadget("TestGadget", 0, 0, 20, 10, "TestButton");
  }

  @Test
  public void getName() {
    assertEquals("TestGadget", gadget.getName());
  }

  @Test
  public void getUpperLeftPoint() {
    assertEquals(0, gadget.getUpperLeftPoint().x);
    assertEquals(0, gadget.getUpperLeftPoint().y);
  }

  @Test
  public void getUpperRightPoint() {
    assertEquals(20, gadget.getUpperRightPoint().x);
    assertEquals(0, gadget.getUpperRightPoint().y);
  }

  @Test
  public void getLowerRightPoint() {
    assertEquals(20, gadget.getLowerRightPoint().x);
    assertEquals(-10, gadget.getLowerLeftPoint().y);
  }

  @Test
  public void getLowerLeftPoint() {
    assertEquals(0, gadget.getLowerLeftPoint().x);
    assertEquals(-10, gadget.getLowerLeftPoint().y);
  }

  @Test
  public void getButtonLabel() {
    assertEquals("TestButton", gadget.getButtonLabel());
  }

  @Test
  public void move() {
    gadget.move(15, 15);
    assertEquals(15, gadget.getUpperLeftPoint().x);
    assertEquals(15, gadget.getUpperLeftPoint().y);
    assertEquals(35, gadget.getUpperRightPoint().x);
    assertEquals(15, gadget.getUpperRightPoint().y);
    assertEquals(35, gadget.getLowerRightPoint().x);
    assertEquals(5, gadget.getLowerRightPoint().y);
    assertEquals(15, gadget.getLowerLeftPoint().x);
    assertEquals(5, gadget.getLowerLeftPoint().y);
  }

  @Test
  public void dragUpperEdge() {
    gadget.dragUpperEdge(-5);
    assertEquals(0, gadget.getUpperLeftPoint().x);
    assertEquals(-5, gadget.getUpperLeftPoint().y);
    assertEquals(20, gadget.getUpperRightPoint().x);
    assertEquals(-5, gadget.getUpperRightPoint().y);
    assertEquals(20, gadget.getLowerRightPoint().x);
    assertEquals(-10, gadget.getLowerRightPoint().y);
    assertEquals(0, gadget.getLowerLeftPoint().x);
    assertEquals(-10, gadget.getLowerLeftPoint().y);
  }

  @Test
  public void dragRightEdge() {
    gadget.dragRightEdge(10);
    assertEquals(0, gadget.getUpperLeftPoint().x);
    assertEquals(0, gadget.getUpperLeftPoint().y);
    assertEquals(30, gadget.getUpperRightPoint().x);
    assertEquals(0, gadget.getUpperRightPoint().y);
    assertEquals(30, gadget.getLowerRightPoint().x);
    assertEquals(-10, gadget.getLowerRightPoint().y);
    assertEquals(0, gadget.getLowerLeftPoint().x);
    assertEquals(-10, gadget.getLowerLeftPoint().y);
  }

  @Test
  public void dragLowerEdge() {
    gadget.dragLowerEdge(-5);
    assertEquals(0, gadget.getUpperLeftPoint().x);
    assertEquals(0, gadget.getUpperLeftPoint().y);
    assertEquals(20, gadget.getUpperRightPoint().x);
    assertEquals(0, gadget.getUpperRightPoint().y);
    assertEquals(20, gadget.getLowerRightPoint().x);
    assertEquals(-15, gadget.getLowerRightPoint().y);
    assertEquals(0, gadget.getLowerLeftPoint().x);
    assertEquals(-15, gadget.getLowerLeftPoint().y);
  }

  @Test
  public void dragLeftEdge() {
    gadget.dragLeftEdge(-5);
    assertEquals(-5, gadget.getUpperLeftPoint().x);
    assertEquals(0, gadget.getUpperLeftPoint().y);
    assertEquals(20, gadget.getUpperRightPoint().x);
    assertEquals(0, gadget.getUpperRightPoint().y);
    assertEquals(20, gadget.getLowerRightPoint().x);
    assertEquals(-10, gadget.getLowerRightPoint().y);
    assertEquals(-5, gadget.getLowerLeftPoint().x);
    assertEquals(-10, gadget.getLowerLeftPoint().y);
  }

  @Test
  public void testToString() {
    assertEquals("Gadget{name=TestGadget, " +
            "upperLeftPoint=Point{x=0,y=0}, " +
            "upperRightPoint=Point{x=20,y=0}, " +
            "lowerRightPoint=Point{x=20,y=-10}, " +
            "lowerLeftPoint=Point{x=0,y=-10}, " +
            "buttonLabel=TestButton}",
        gadget.toString());
  }

  @Test
  public void createAtOrigin() {
    Gadget gadget = Gadget.createAtOrigin("Some name", "Some button label");
    assertEquals("Some name", gadget.getName());
    assertEquals("Some button label", gadget.getButtonLabel());
    assertEquals(-10, gadget.getUpperLeftPoint().x);
    assertEquals(10, gadget.getUpperLeftPoint().y);
    assertEquals(10, gadget.getUpperRightPoint().x);
    assertEquals(10, gadget.getUpperRightPoint().y);
    assertEquals(10, gadget.getLowerRightPoint().x);
    assertEquals(-10, gadget.getLowerRightPoint().y);
    assertEquals(-10, gadget.getLowerLeftPoint().x);
    assertEquals(-10, gadget.getLowerLeftPoint().y);
  }
}
