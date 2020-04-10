package com.fatec.zevent.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fatec.zevent.model.enumeration.CategoryEnum;
import com.fatec.zevent.model.enumeration.EventStatusEnum;
import com.fatec.zevent.model.enumeration.EventTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "event")
public class Event {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private String id;
    private String name;
    private CategoryEnum category;
    private EventTypeEnum type;
    private String desc;
    private Date initDate;
    private Date finishDate;
    private double value;
    private EventStatusEnum status;

    public CategoryEnum getCategory() {
        return category;
    }

    public Event setCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    public EventTypeEnum getType() {
        return type;
    }

    public Event setType(EventTypeEnum type) {
        this.type = type;
        return this;
    }

    public Date getInitDate() {
        return initDate;
    }

    public Event setInitDate(Date initDate) {
        this.initDate = initDate;
        return this;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public Event setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    public double getValue() {
        return value;
    }

    public Event setValue(double value) {
        this.value = value;
        return this;
    }

    public EventStatusEnum getStatus() {
        return status;
    }

    public Event setStatus(EventStatusEnum status) {
        this.status = status;
        return this;
    }

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
