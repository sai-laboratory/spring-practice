package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int status;

    public Task() {}

    public Task(String title, int status) {
        this.title = title;
        this.status = status;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public int getStatus() { return status; }
}
