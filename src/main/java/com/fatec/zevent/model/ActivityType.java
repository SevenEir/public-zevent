package com.fatec.zevent.model;

import javax.validation.constraints.NotNull;
import java.util.List;

public class ActivityType {

    @NotNull(message = "Activity Type's name must not be null")
    private String name;

    @NotNull(message = "Activity Type's points must not be null")
    private int points;

    private List<Activity> activities;

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

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

}
