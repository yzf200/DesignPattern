package com.fei.designpattern.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //当前格式为mp4格式,vlc不做具体实现
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 mp4 文件 : "+fileName);
    }
}
