package com.eduardordguez.creational.builder;

/**
 * The `Product` component is the complex object that the `Builder` pattern is responsible for
 * constructing.
 */
public class Computer {

  private final String SSD;
  private final String RAM;

  public Computer(ComputerBuilder computerBuilder) {
    this.SSD = computerBuilder.SSD;
    this.RAM = computerBuilder.RAM;
  }

  public static ComputerBuilder builder() {
    return new ComputerBuilder();
  }

  public String getSSD() {
    return SSD;
  }

  public String getRAM() {
    return RAM;
  }

  @Override
  public String toString() {
    return "Computer{SSD='" + this.SSD + "', RAM='" + this.RAM + "'}";
  }

  /**
   * This class acts as both `Builder` and `Concrete Builder` that manages the steps needed to
   * create the complex object or a specific variation of the product.
   */
  public static class ComputerBuilder {
    private String SSD;
    private String RAM;

    public ComputerBuilder() {

    }

    public ComputerBuilder ssd(String ssd) {
      this.SSD = ssd;
      return this;
    }

    public ComputerBuilder ram(String ram) {
      this.RAM = ram;
      return this;
    }

    /**
     * The `Director` is implicitly handled here and is responsible for managing the construction
     * process.
     *
     * @return {@link Computer} product.
     */
    public Computer build() {
      return new Computer(this);
    }
  }

}
