package com.eduardordguez.solid.liskovsubstitution;

/**
 * The subclass Circle.
 */
public class Circle extends Shape {

  private static final int EXPONENT = 2;
  private float radius;

  public Circle(float radius) {
    setRadius(radius);
  }

  @Override
  double getArea() {
    return Math.PI * Math.pow(radius, EXPONENT);
  }

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    if (radius < 0) {
      throw new IllegalArgumentException("Ratio must be greater than or equal to 0");
    }
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "Circle{radius='" + this.radius + "'}";
  }

}
