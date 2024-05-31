package com.eduardordguez.structural.bridge;

/**
 * The `Shape` abstract class provides high-level control logic. It relies on the implementation
 * object to do the actual low-level work.
 */
public abstract class Shape {

  protected Color color;

  public Shape(Color color) {
    this.color = color;
  }

  abstract void draw();

}
