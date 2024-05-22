package com.eduardordguez.solid.liskovsubstitution;

/**
 * `Liskov Substitution` principle states that if S is a subtype of B, then can be expected
 * that S will have the same behaviors as B. Therefore, S can be used in place of B, and it would
 * not affect the software.
 */
public class LiskovSubstitutionPrinciple {

  public static void main(String[] args) {
    Circle circle = new Circle(3);
    System.out.println(circle + " area: " + circle.getArea());

    Rectangle rectangle = new Rectangle(7, 4);
    System.out.println(rectangle + " area: " + rectangle.getArea());
  }

}
