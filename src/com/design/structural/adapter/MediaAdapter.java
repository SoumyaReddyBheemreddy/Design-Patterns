package com.design.structural.adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    MediaAdapter(){
        advancedMediaPlayer = new Mp4Player();
    }
    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.playMP4(fileName);
    }
}
