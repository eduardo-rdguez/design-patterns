package com.eduardordguez.behavioral.command;

import java.util.Objects;
import java.util.UUID;

public class Contact {

  private String id;
  private String username;
  private String email;

  public Contact(String id, String username, String email) {
    this.username = username;
    this.email = email;

    if (Objects.isNull(id)) {
      setId();
    }
  }

  public String getId() {
    return id;
  }

  public void setId() {
    this.id = UUID.randomUUID().toString();
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
