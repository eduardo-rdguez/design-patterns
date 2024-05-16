package com.eduardordguez.creational.singleton;

import java.util.Objects;

/**
 * `Singleton` is a creational design pattern, which ensures that only one object of its kind
 * exists and provides a single point of access to it for any other code.
 */
public final class ThreadSafeDoubleCheckedLocking {

  // The volatile keyword suggests to the compiler that it never store the value in cache memory
  // and ensures that multiple threads read the correct instance value.
  private static volatile ThreadSafeDoubleCheckedLocking instance;

  /**
   * Private constructor prevents external classes from creating new instances.
   */
  private ThreadSafeDoubleCheckedLocking() {
    // Protect initialization via reflection.
    if (Objects.nonNull(instance)) {
      throw new IllegalStateException("Already initialized");
    }
  }

  /**
   * Method to create a new instance of `Singleton` class if it is not yet created.
   * The `synchronized` keyword prevents a block of code to be executed by more than one thread
   * at the same time.
   *
   * @return {@link ThreadSafeDoubleCheckedLocking} object.
   */
  public static ThreadSafeDoubleCheckedLocking getInstance() {
    if (Objects.nonNull(instance)) {
      return instance;
    }
    synchronized (ThreadSafeDoubleCheckedLocking.class) {
      if (Objects.isNull(instance)) {
        instance = new ThreadSafeDoubleCheckedLocking();
      }
    }
    return instance;
  }

  /**
   * Method to override the clone method to prevent cloning of the `Singleton` object.
   * Instead, an exception is thrown to indicate that cloning of the object is not supported.
   *
   * @return {@link ThreadSafeDoubleCheckedLocking} object.
   */
  @Override
  protected ThreadSafeDoubleCheckedLocking clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

}
