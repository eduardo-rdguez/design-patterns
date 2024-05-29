package com.eduardordguez.behavioral.chainofresponsibility;

/**
 * `Chain of Responsibility` is a behavioral design pattern that lets you pass requests along a
 * chain of handlers. Upon receiving a request, each handler decides either to process the
 * request or to pass it to the next handler in the chain.
 */
public class ChainOfResponsibilityPattern {

  public static void main(String[] args) {
    SupportHandler criticalSupportHandler = new CriticalSupportHandler();
    SupportHandler intermediateSupportHandler = new IntermediateSupportHandler(criticalSupportHandler);
    SupportHandler basicSupportHandler = new BasicSupportHandler(intermediateSupportHandler);

    Request basicRequest = new Request(Priority.BASIC);
    Request intermidiateRequest = new Request(Priority.INTERMEDIATE);
    Request critialRequest = new Request(Priority.CRITICAL);

    basicSupportHandler.handleRequest(basicRequest);
    basicSupportHandler.handleRequest(intermidiateRequest);
    basicSupportHandler.handleRequest(critialRequest);
  }

}
