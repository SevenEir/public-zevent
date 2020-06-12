package com.fatec.zevent.model;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Activity implements Checkable {

    @NotNull(message = "Activity's name must not be null")
    private String name;
    @NotNull(message = "Activity's description must not be null")
    private String desc;
    @NotNull(message = "Activity's initial date must not be null")
    private Date initDate;
    @NotNull(message = "Activity's finish date must not be null")
    private Date finishDate;
    @NotNull(message = "Activity's seats must not be null")
    private int seats;
    @NotNull(message = "Activity's points must not be null")
    private int points;

    private List<User> responsible;
    public Set<String> subscribedIds = new HashSet<String>();

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

    public List<User> getResponsible() {
        return responsible;
    }

    public Activity setResponsible(List<User> responsible) {
        this.responsible = responsible;
        return this;
    }

    public Set<String> getSubscribedIds() {
        return this.subscribedIds;
    }
}
