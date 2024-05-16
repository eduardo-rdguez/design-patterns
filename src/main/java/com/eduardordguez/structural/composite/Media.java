package com.eduardordguez.structural.composite;

/**
 * The `Component` declares the common methods for the leaf and composites.
 */
public interface Media {

  void play();

  void setPlaybackSpeed(float speed);

  String getName();

}
