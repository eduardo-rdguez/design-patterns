package com.eduardordguez.behavioral.observer;

import java.util.ArrayList;

/**
 * The `Concrete Subject` notify their observers when the state changes.
 */
public class Channel implements Subject {

  private ArrayList<Observer> observers;
  private String channelName;
  private String status;

  public Channel(String channelName, String status) {
    this.channelName = channelName;
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(status));
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

}
