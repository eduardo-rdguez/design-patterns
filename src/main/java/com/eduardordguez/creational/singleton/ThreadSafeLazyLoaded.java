package com.eduardordguez.creational.singleton;

import java.util.Objects;

/**
 * `Singleton` is a creational design pattern, which ensures that only one object of its kind
 * exists and provides a single point of access to it for any other code.
 */
public final class ThreadSafeLazyLoaded {

  // The volatile keyword ensures atomic access by multiple thread.
  private static volatile ThreadSafeLazyLoaded instance;

  /**
   * Private constructor prevents external classes from creating new instances.
   */
  private ThreadSafeLazyLoaded() {
    // Protect initialization via reflection.
    if (Objects.nonNull(instance)) {
      throw new IllegalStateException("Already initialized");
    }
  }

  /**
   * Method to create a new instance of `Singleton` class if it is not yet created.
   *
   * @return {@link ThreadSafeLazyLoaded} object.
   */
  public static synchronized ThreadSafeLazyLoaded getInstance() {
    if (Objects.isNull(instance)) {
      instance = new ThreadSafeLazyLoaded();
    }
    return instance;
  }

  /**
   * Method to override the clone method to prevent cloning of the `Singleton` object.
   * Instead, an exception is thrown to indicate that cloning of the object is not supported.
   *
   * @return {@link ThreadSafeLazyLoaded} object.
   */
  @Override
  protected ThreadSafeLazyLoaded clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

}
