package com.eduardordguez.behavioral.observer;

/**
 * The `Subject` component provides methods to register and unregister observers dynamically and
 * defines a method to notify observers of changes in its state.
 */
public interface Subject {

  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();

}
