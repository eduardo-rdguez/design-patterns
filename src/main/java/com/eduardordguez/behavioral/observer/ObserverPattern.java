package com.eduardordguez.behavioral.observer;

public class ObserverPattern {

  public static void main(String[] args) {
    Follower followerA = new Follower("FollowerA");
    Follower followerB = new Follower("FollowerB");

    Channel channel = new Channel("ChannelX", "SomeStatus");
    channel.registerObserver(followerA);
    channel.registerObserver(followerB);
    channel.removeObserver(followerA);
    channel.notifyObservers();
  }

}
