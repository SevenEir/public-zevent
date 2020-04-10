package com.fatec.zevent.model;

import com.fatec.zevent.model.enumeration.CheckpointType;

import java.util.Date;

public class Checkpoint {
    private Date date;
    private CheckpointType type;
    private User user;
    private Checkable local;

    public Date getDate() {
        return date;
    }

    public Checkpoint setDate(Date date) {
        this.date = date;
        return this;
    }

    public CheckpointType getType() {
        return type;
    }

    public Checkpoint setType(CheckpointType type) {
        this.type = type;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Checkpoint setUser(User user) {
        this.user = user;
        return this;
    }

    public Checkable getLocal() {
        return local;
    }

    public Checkpoint setLocal(Checkable local) {
        this.local = local;
        return this;
    }
}
