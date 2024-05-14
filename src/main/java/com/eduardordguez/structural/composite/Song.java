package com.eduardordguez.structural.composite;

public class Song implements IComponent {

  private final String songName;
  private final String artist;
  public float speed = 1;

  public Song(String songName, String artist) {
    this.songName = songName;
    this.artist = artist;
  }

  @Override
  public void play() {
    System.out.println("Song: " + songName + " Artist: " + artist);
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
