package com.eduardordguez.behavioral.observer;

import java.util.ArrayList;

/**
 * The `Concrete Subject` notify their observers when the state changes.
 */
public class Channel implements Subject {

  private final ArrayList<Observer> observers;
  private String channelName;

  public Channel(String channelName) {
    this.channelName = channelName;
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(channelName));
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

}
