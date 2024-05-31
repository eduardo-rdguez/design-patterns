package com.eduardordguez.structural.bridge;

/**
 * The `BlackColor` concrete implementation contains platform-specific code.
 */
public class BlackColor implements Color {

  private final ColorType colorType;

  public BlackColor() {
    this.colorType = ColorType.BLACK;
  }

  @Override
  public String getColor() {
    return colorType.toString();
  }

  @Override
  public void apply() {
    // do something
  }

}
