package com.eduardordguez.solid.dependencyinversion;

/**
 * The high-level module class depends on the `NotificationService` interface rather than the
 * concrete implementation.
 */
public class NotificationManager {

  private final NotificationService notificationService;

  public NotificationManager(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  public void notify(String message) {
    notificationService.sendMessage(message);
  }

}
