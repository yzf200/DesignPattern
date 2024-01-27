package com.fei.designpattern.structural.adapter;

public class Test {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","老中医.mp3");
        audioPlayer.play("vlc","老中医.vlc");
        audioPlayer.play("mp4","老中医.mp4");

    }
}
