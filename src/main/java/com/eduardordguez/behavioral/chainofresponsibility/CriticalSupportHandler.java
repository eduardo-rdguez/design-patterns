package com.eduardordguez.behavioral.chainofresponsibility;

/**
 * The `CriticalSupportHandler` concrete handler implements how the request is going to be handled
 * or throws an error message if it is unable to handle that request.
 */
public class CriticalSupportHandler implements SupportHandler {

  @Override
  public void handleRequest(Request request) {
    if (request.getPriority().equals(Priority.CRITICAL)) {
      System.out.println("Level Critical Support handled the request");
    } else {
      System.out.println("Request cannot be handled");
    }
  }

}
