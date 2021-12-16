package com.pcoet.patterns.oop.design;

public class Gadget extends Widget {
  private final String buttonLabel;
  /**
   * Gadget constructor
   *
   * @param name
   * @param upperLeftX The x value of the upper-left corner of the Widget
   * @param upperLeftY The y value of the upper-left corner of the Widget
   * @param width      The width of the widget
   * @param height     the height of the widget
   */
  Gadget(String name, int upperLeftX, int upperLeftY, int width, int height, String buttonLabel) {
    super(name, upperLeftX, upperLeftY, width, height);
    this.buttonLabel = buttonLabel;
  }

  public String getButtonLabel() {
    return this.buttonLabel;
  }

  @Override
  public String toString() {
    return "Gadget{" +
        "name=" + super.getName() +
        ", upperLeftPoint=" + super.getUpperLeftPoint() +
        ", upperRightPoint=" + super.getUpperRightPoint() +
        ", lowerRightPoint=" + super.getLowerRightPoint() +
        ", lowerLeftPoint=" + super.getLowerLeftPoint() +
        '}';
  }
}
