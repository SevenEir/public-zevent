package com.fatec.zevent.model;

import com.fatec.zevent.model.enumeration.CheckpointTypeEnum;

import java.util.Date;

public class Checkpoint {
    private String id;
    private Date date;
    private CheckpointTypeEnum type;
    private String userId;
    private Checkable local;

    public Date getDate() {
        return date;
    }

    public Checkpoint setDate(Date date) {
        this.date = date;
        return this;
    }

    public CheckpointTypeEnum getType() {
        return type;
    }

    public Checkpoint setType(CheckpointTypeEnum type) {
        this.type = type;
        return this;
    }

    public String getUser() {
        return userId;
    }

    public Checkpoint setUser(String userId) {
        this.userId = userId;
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
