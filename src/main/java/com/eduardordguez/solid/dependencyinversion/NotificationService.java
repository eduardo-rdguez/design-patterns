package com.eduardordguez.solid.dependencyinversion;

/**
 * The abstraction interface that both high-level and low-level modules depend on.
 */
public interface NotificationService {

  void sendMessage(String message);

}
