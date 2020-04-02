package com.example.demo;

//resource class
public class Greeting {
    private final long id;
    private final String content;
    private final int anInt;

//constructor for id and content data
    public Greeting(long id, String content, int anInt) {
        this.id = id;
        this.content = content;
        this.anInt =anInt;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getA() {return anInt; }
}
