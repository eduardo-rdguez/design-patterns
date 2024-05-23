package com.eduardordguez.solid.dependencyinversion;

/**
 * The low-level module that provides concrete implementations to send the notification.
 */
public class SmsNotificationService implements NotificationService {

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending SMS: " + message);
  }

}
