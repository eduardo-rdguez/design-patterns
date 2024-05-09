package com.eduardordguez.creational.factorymethod;

/**
 * The `creator` is the abstract class that declares the factory method.
 */
public abstract class KnifeStore {

  /**
   * Method that work with the created objects.
   *
   * @param knifeType {@link String}
   * @return {@link Knife} type object.
   */
  public Knife orderKnife(String knifeType) {
    Knife knife = createKnife(knifeType);
    knife.sharpen();
    knife.polish();
    knife.pack();
    return knife;
  }

  /**
   * Method that serves as a factory for creating objects.
   *
   * @param knifeType {@link String}
   * @return {@link Knife} type object.
   */
  abstract Knife createKnife(String knifeType);

}
