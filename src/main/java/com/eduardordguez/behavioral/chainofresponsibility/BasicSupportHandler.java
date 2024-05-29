package com.eduardordguez.behavioral.chainofresponsibility;

/**
 * The `BasicSupportHandler` concrete handler implements how the request is going to be handled or
 * passes it to the next handler in the chain if it is unable to handle that request.
 */
public class BasicSupportHandler implements SupportHandler {

  private final SupportHandler nextHandler;

  public BasicSupportHandler(SupportHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handleRequest(Request request) {
    if (request.getPriority().equals(Priority.BASIC)) {
      System.out.println("Level Basic Support handled the request");
    } else {
      nextHandler.handleRequest(request);
    }
  }

}
