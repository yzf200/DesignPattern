package com.fei.designpattern.structural.flyweight;

public class Manager implements Employee {

    private String department;
    private String noteContent;

    public Manager(String department) {
        this.department = department;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public void report() {
        System.out.println(this.noteContent);
    }
}
