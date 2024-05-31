package com.eduardordguez.structural.bridge;

/**
 * The `Triangle` refined abstraction provide variants of control logic.
 */
public class Triangle extends Shape {

  public Triangle(Color color) {
    super(color);
  }

  @Override
  void draw() {
    System.out.println("Drawing a " + color.getColor() + " triangle");
    color.apply();
  }

}
