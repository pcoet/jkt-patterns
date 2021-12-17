package com.pcoet.patterns.oop.design;

/**
 * A Gadget is a Widget with a buttonLabel.
 */
public class Gadget extends Widget {
  private final String buttonLabel;
  /**
   * Gadget constructor
   *
   * @param name        The name of the Gadget
   * @param upperLeftX  The x value of the upper-left corner of the Gadget
   * @param upperLeftY  The y value of the upper-left corner of the Gadget
   * @param width       The width of the Gadget
   * @param height      The height of the Gadget
   * @param buttonLabel A descriptive label for the button on the Gadget
   */
  Gadget(String name, int upperLeftX, int upperLeftY, int width, int height, String buttonLabel) {
    super(name, upperLeftX, upperLeftY, width, height);
    this.buttonLabel = buttonLabel;
  }

  /**
   * Creates a 20 x 20 Widget centered at (0,0).
   * @param name The name of the Gadget
   * @param buttonLabel A descriptive label for the button on the Gadget
   * @return An instance of Gadget
   */
  public static Gadget createAtOrigin(String name, String buttonLabel) {
    return new Gadget(name, -10, 10, 20, 20, buttonLabel);
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
        ", buttonLabel=" + this.buttonLabel +
        '}';
  }
}
