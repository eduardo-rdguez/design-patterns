package com.eduardordguez.structural.bridge;

/**
 * The `WhiteColor` concrete implementation contains platform-specific code.
 */
public class WhiteColor implements Color {

  private final ColorType colorType;

  public WhiteColor() {
    this.colorType = ColorType.WHITE;
  }

  @Override
  public String getColor() {
    return this.colorType.toString();
  }

  @Override
  public void apply() {
    // do something
  }

}
