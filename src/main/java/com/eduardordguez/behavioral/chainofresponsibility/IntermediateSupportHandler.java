package com.eduardordguez.behavioral.chainofresponsibility;

/**
 * The `IntermediateSupportHandler` concrete handler implements how the request is going to be
 * handled or passes it to the next handler in the chain if it is unable to handle that request.
 */
public class IntermediateSupportHandler implements SupportHandler {

  private final SupportHandler nextHandler;

  public IntermediateSupportHandler(SupportHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handleRequest(Request request) {
    if (request.getPriority().equals(Priority.INTERMEDIATE)) {
      System.out.println("Level Intermediate Support handled the request");
    } else {
      nextHandler.handleRequest(request);
    }
  }

}
