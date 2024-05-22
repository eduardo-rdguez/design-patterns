package com.eduardordguez.behavioral.observer;

/**
 * The `Concrete Observer` reacts when notified of a state change.
 */
public class Follower implements Observer {

  private String followerName;

  public Follower(String followerName) {
    this.followerName = followerName;
  }

  @Override
  public void update(String channel) {
    System.out.println("New " + channel + " updates -> " + followerName);
  }

  public String getFollowerName() {
    return followerName;
  }

  public void setFollowerName(String followerName) {
    this.followerName = followerName;
  }

}
