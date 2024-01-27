package com.fei.designpattern.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 vlc 文件 : "+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //当前格式为vlc格式,mp4不做具体实现
    }
}
