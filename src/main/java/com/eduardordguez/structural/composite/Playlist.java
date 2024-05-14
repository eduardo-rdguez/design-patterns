package com.eduardordguez.structural.composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

  private final String playlistName;
  private final ArrayList<IComponent> playlist = new ArrayList<>();

  public Playlist(String playlistName) {
    this.playlistName = playlistName;
  }

  @Override
  public void play() {
    playlist.forEach(IComponent::play);
  }

  @Override
  public void setPlaybackSpeed(float speed) {
    playlist.forEach(component -> component.setPlaybackSpeed(speed));
  }

  @Override
  public String getName() {
    return this.playlistName;
  }

  public void add(IComponent component) {
    this.playlist.add(component);
  }

  public void remove(IComponent component) {
    this.playlist.remove(component);
  }

}
