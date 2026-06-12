package com.example.demo;

public class Task {
    private int id;
    private String title;
    private int status;

    public Task(int id, String title, int status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public int getStatus() { return status; }
}
