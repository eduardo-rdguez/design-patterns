package com.eduardordguez.behavioral.chainofresponsibility;

public class Request {

  private final Priority priority;

  public Request(Priority priority) {
    this.priority = priority;
  }

  public Priority getPriority() {
    return priority;
  }

}
