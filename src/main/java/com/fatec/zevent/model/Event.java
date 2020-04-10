package com.fatec.zevent.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fatec.zevent.model.enumeration.CategoryEnum;
import com.fatec.zevent.model.enumeration.EventStatusEnum;
import com.fatec.zevent.model.enumeration.EventTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "event")
public class Event implements Checkable {

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
    private int seats;
    private User responsible;
    private Organization organization;
    private Address address;
    private List<Activity> activities;
    private List<Stand> stands;
    private List<ActivityType> activityTypes;
    private List<Comment> comments;

    public String getId() {
        return id;
    }

    public Event setId(String id) {
        this.id = id;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public Event setSeats(int seats) {
        this.seats = seats;
        return this;
    }

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

    public Organization getOrganization() {
        return organization;
    }

    public Event setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public Event setActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }

    public List<Stand> getStands() {
        return stands;
    }

    public Event setStands(List<Stand> stands) {
        this.stands = stands;
        return this;
    }

    public List<ActivityType> getActivityTypes() {
        return activityTypes;
    }

    public Event setActivityTypes(List<ActivityType> activityTypes) {
        this.activityTypes = activityTypes;
        return this;
    }

    public User getResponsible() {
        return responsible;
    }

    public Event setResponsible(User responsible) {
        this.responsible = responsible;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Event setAddress(Address address) {
        this.address = address;
        return this;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Event setComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }
}
