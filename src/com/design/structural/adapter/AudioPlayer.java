package com.design.structural.adapter;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file name: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
                MediaPlayer mediaPlayer = new MediaAdapter();
                mediaPlayer.play(audioType,fileName);
        }
        else {
            System.out.println("Invalid audio type");
        }
    }
}
