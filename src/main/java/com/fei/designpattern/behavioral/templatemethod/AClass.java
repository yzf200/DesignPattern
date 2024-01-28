package com.fei.designpattern.behavioral.templatemethod;

public abstract class AClass {

    protected final void makeClass(){

        this.makePPT();

        if(flag()){
            this.makeNote();
            this.isMakeNote();
        }

        this.makeVideo();

    }

    public final void makePPT(){
        System.out.println("制作课程的PPT");
    }

    public final void makeNote(){
        System.out.println("制作课程的讲义");
    }

    public final void makeVideo(){
        System.out.println("制作课程的视频");
    }

    protected boolean flag(){
        return false;
    }

    public abstract void isMakeNote();

}
