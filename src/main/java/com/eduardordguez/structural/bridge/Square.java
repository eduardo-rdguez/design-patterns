package com.eduardordguez.structural.bridge;

/**
 * The `Square` refined abstraction provide variants of control logic.
 */
public class Square extends Shape {

  public Square(Color color) {
    super(color);
  }

  @Override
  void draw() {
    System.out.println("Drawing a " + color.getColor() + " square");
    color.apply();
  }

}
