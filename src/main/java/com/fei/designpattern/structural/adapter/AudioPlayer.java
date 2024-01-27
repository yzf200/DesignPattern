package com.fei.designpattern.structural.adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //音频文件,比如mp3
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放 mp3 文件 : "+fileName);
        }else if(
                audioType.equalsIgnoreCase("vlc")
                ||
                audioType.equalsIgnoreCase("mp4")
        ){
            //视频文件,高级媒体文件
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType,fileName);
        }

    }
}
