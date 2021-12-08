package com.pcoet.patterns.oop.design;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

  @Test
  public void testToString() {
    Point p = new Point(0, 0);
    assertEquals("Point{x=0,y=0}", p.toString());
  }
}