package com.fatec.zevent.model;

public class Comment {
    private String text;
    private String authorId;

    public String getText() {
        return text;
    }

    public Comment setText(String text) {
        this.text = text;
        return this;
    }

    public String getAuthorId() {
        return authorId;
    }

    public Comment setAuthorId(String author) {
        this.authorId = author;
        return this;
    }
}
