package com.fei.designpattern.structural.adapter;

public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(String audioType) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }

    }

    @Override
    public void play(String audioType, String fileName) {
        //判断当前的格式audioType为vlc还是mp4
        if(audioType.equalsIgnoreCase("vlc")){
            //创建vlc高级媒体播放器进行播放文件
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            //创建mp4高级媒体播放器进行播放文件
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
