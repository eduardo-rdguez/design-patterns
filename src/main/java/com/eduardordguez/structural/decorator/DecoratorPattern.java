package com.eduardordguez.structural.decorator;

/**
 * `Decorator` is a structural design pattern that lets you attach new behaviors to objects by
 * placing these objects inside special wrapper objects that contain the behaviors.
 */
public class DecoratorPattern {

  public static void main(String[] args) {
    Coffee coffee = new SimpleCoffee();
    System.out.println("Simple Coffee $" + coffee.getCost());

    coffee = new MilkDecorator(coffee);
    System.out.println("Coffee with" + coffee.getExtras() + " $" + coffee.getCost());

    coffee = new ChocolateBarDecorator(coffee);
    System.out.println("Coffee with" + coffee.getExtras() + " $" + coffee.getCost());
  }

}
