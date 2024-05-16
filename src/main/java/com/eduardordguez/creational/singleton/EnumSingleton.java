package com.eduardordguez.creational.singleton;

/**
 * Enum `Singleton` ensures only one initialization and values ares globally accessible.
 * However, Enum type doesn't allow lazy initialization.
 */
public enum EnumSingleton {
  INSTANCE;

  @Override
  public String toString() {
    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
  }
}
