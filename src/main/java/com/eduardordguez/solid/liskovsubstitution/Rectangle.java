package com.eduardordguez.solid.liskovsubstitution;

/**
 * The subclass Rectangle.
 */
public class Rectangle extends Shape {

  private float height;
  private float width;

  public Rectangle(float height, float width) {
    setHeight(height);
    setWidth(width);
  }

  @Override
  double getArea() {
    return height * width;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    if (height < 0) {
      throw new IllegalArgumentException("Height must be greater than or equal to 0");
    }
    this.height = height;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    if (width < 0) {
      throw new IllegalArgumentException("Width must be greater than or equal to 0");
    }
    this.width = width;
  }

  @Override
  public String toString() {
    return "Rectangle{height='" + this.height + "', width='" + this.width + "'}";
  }

}
