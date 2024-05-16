package com.eduardordguez.structural.composite;

import java.util.ArrayList;

/**
 * The `Composite` component stores child components and implements the methods declared in the
 * component interface.
 */
public class Playlist implements Media {

  private final String playlistName;
  private final ArrayList<Media> playlist = new ArrayList<>();

  public Playlist(String playlistName) {
    this.playlistName = playlistName;
  }

  @Override
  public void play() {
    playlist.forEach(Media::play);
  }

  @Override
  public void setPlaybackSpeed(float speed) {
    playlist.forEach(component -> component.setPlaybackSpeed(speed));
  }

  @Override
  public String getName() {
    return this.playlistName;
  }

  public void add(Media component) {
    this.playlist.add(component);
  }

  public void remove(Media component) {
    this.playlist.remove(component);
  }

}
