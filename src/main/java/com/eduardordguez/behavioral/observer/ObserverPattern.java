package com.eduardordguez.behavioral.observer;

/**
 * `Observer` is a behavioral design pattern that lets you define a subscription mechanism to
 * notify multiple objects about any events that happen to the object they’re observing.
 */
public class ObserverPattern {

  public static void main(String[] args) {
    Follower followerA = new Follower("FollowerA");
    Follower followerB = new Follower("FollowerB");
    Follower followerC = new Follower("FollowerC");

    Channel channelX = new Channel("ChannelX");
    Channel channelY = new Channel("ChannelY");

    channelX.registerObserver(followerA);
    channelX.registerObserver(followerB);
    channelY.registerObserver(followerC);

    channelX.notifyObservers();
    channelY.notifyObservers();
  }

}
