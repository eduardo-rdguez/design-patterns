package com.eduardordguez.solid.dependencyinversion;

/**
 * The `Dependency Inversion` principle states that high-level modules should not depend upon
 * low-level modules; they should depend on abstractions. Also, abstractions should not
 * depend upon details; details should depend upon abstractions.
 */
public class DependencyInversionPrinciple {

  public static void main(String[] args) {
    NotificationService emailNotificationService = new EmailNotificationService();
    NotificationManager emailNotificationManager = new NotificationManager(emailNotificationService);
    emailNotificationManager.notify("This is an email notification");

    NotificationService smsNotificationService = new SmsNotificationService();
    NotificationManager smsNotificationManager = new NotificationManager(smsNotificationService);
    smsNotificationManager.notify("This is an SMS notification");
  }

}
