package com.eduardordguez.behavioral.observer;

/**
 * The `Observer` component defines an interface with an update method that concrete observers
 * must implement and ensures a common or consistent way for concrete observers to receive
 * updates from the subject.
 */
public interface Observer {

  void update(String status);

}
