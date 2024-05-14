package com.eduardordguez.structural.composite;

public class App {

  private static final float SLOW_SPEED = 0.5f;
  private static final float FASTER_SPEED = 1.25f;

  public void start() {
    Playlist studyPlaylist = new Playlist("study");
    Playlist indiePlaylist = new Playlist("indie");
    Playlist experimentalPlaylist = new Playlist("experimental");

    Song studySong = new Song("Low Tide", "Ren Lockhart");
    Song indieSong = new Song("Zero", "Yeah Yeah Yeahs");
    Song glitchSong = new Song("Yellow", "Coldplay");

    studyPlaylist.add(studySong);
    indiePlaylist.add(indieSong);

    experimentalPlaylist.setPlaybackSpeed(SLOW_SPEED);
    experimentalPlaylist.add(studyPlaylist);
    studyPlaylist.add(indiePlaylist);

    glitchSong.setPlaybackSpeed(FASTER_SPEED);
    glitchSong.play();

    System.out.println("The song name is " + glitchSong.getName());
    System.out.println("The song artist is " + glitchSong.getArtist());

    studyPlaylist.add(glitchSong);
    studyPlaylist.play();

    System.out.println("The playlist's name is " + studyPlaylist.getName());
  }

}
