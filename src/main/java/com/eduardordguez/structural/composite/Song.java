package com.eduardordguez.structural.composite;

/**
 * The `Leaf` component defines the behaviour for the elements in the composition. It is the
 * building block for the composition and implements base component.
 */
public class Song implements Media {

  private final String songName;
  private final String artist;
  public float speed = 1;

  public Song(String songName, String artist) {
    this.songName = songName;
    this.artist = artist;
  }

  @Override
  public void play() {
    // do something
  }

  @Override
  public void setPlaybackSpeed(float speed) {
    this.speed = speed;
  }

  @Override
  public String getName() {
    return songName;
  }

  public String getArtist() {
    return artist;
  }

}
