package com.eduardordguez.behavioral.chainofresponsibility;

/**
 * The `SupportHandler` is the interface for handling requests and chaining to the next handler
 * in the sequence.
 */
public interface SupportHandler {

  void handleRequest(Request request);

}
