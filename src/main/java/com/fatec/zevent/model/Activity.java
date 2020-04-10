package com.fatec.zevent.model;

import java.util.Date;
import java.util.List;

public class Activity implements Checkable {

    private String name;
    private String desc;
    private Date initDate;
    private Date finishDate;
    private int seats;
    private int points;
    private ActivityType type;
    private List<User> responsible;

    public String getName() {
        return name;
    }

    public Activity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Activity setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Date getInitDate() {
        return initDate;
    }

    public Activity setInitDate(Date initDate) {
        this.initDate = initDate;
        return this;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public Activity setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public Activity setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getPoints() {
        return points;
    }

    public Activity setPoints(int points) {
        this.points = points;
        return this;
    }

    public ActivityType getType() {
        return type;
    }

    public Activity setType(ActivityType type) {
        this.type = type;
        return this;
    }

    public List<User> getResponsible() {
        return responsible;
    }

    public Activity setResponsible(List<User> responsible) {
        this.responsible = responsible;
        return this;
    }
}
