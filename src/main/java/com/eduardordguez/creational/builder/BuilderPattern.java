package com.eduardordguez.creational.builder;

/**
 * `Builder` is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the
 * same construction code.
 */
public class BuilderPattern {

  public static void main(String[] args) {
    Computer computer = Computer.builder().ssd("10TB").ram("32GB").build();
    System.out.println(computer.toString());
  }

}
