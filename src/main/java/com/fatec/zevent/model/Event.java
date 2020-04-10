package com.fatec.zevent.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class Event {

    @JsonSerialize(using = ToStringSerializer.class)
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public Event setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Event setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
