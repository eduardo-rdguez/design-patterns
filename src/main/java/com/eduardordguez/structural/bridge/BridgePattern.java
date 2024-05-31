package com.eduardordguez.structural.bridge;

/**
 * `Bridge` is a structural design pattern that lets you split a large class or a set of closely
 * related classes into two separate hierarchies—abstraction and implementation—which can be
 * developed independently of each other.
 */
public class BridgePattern {

  public static void main(String[] args) {
    Color blackColor = new BlackColor();
    Color whiteColor = new WhiteColor();

    Shape triangle = new Triangle(blackColor);
    Shape square = new Square(whiteColor);

    triangle.draw();
    square.draw();
  }

}
