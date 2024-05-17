package com.eduardordguez.creational.builder;

public class BuilderPattern {

  public static void main(String[] args) {
    Computer computer = Computer.builder().ssd("10TB").ram("32GB").build();
    System.out.println(computer.toString());
  }

}
