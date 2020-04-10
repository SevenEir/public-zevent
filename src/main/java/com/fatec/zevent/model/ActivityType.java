package com.fatec.zevent.model;

public class ActivityType {
    private String name;
    private int points;

    public String getName() {
        return name;
    }

    public ActivityType setName(String name) {
        this.name = name;
        return this;
    }

    public int getPoints() {
        return points;
    }

    public ActivityType setPoints(int points) {
        this.points = points;
        return this;
    }
}
