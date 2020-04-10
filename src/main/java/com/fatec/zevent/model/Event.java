package com.fatec.zevent.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fatec.zevent.model.enumeration.CategoryEnum;
import com.fatec.zevent.model.enumeration.EventStatusEnum;
import com.fatec.zevent.model.enumeration.EventTypeEnum;
import com.mongodb.lang.NonNull;
import com.mongodb.lang.Nullable;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Document(collection = "events")
public class Event implements Checkable {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private String id;

    @NotNull(message = "Event's name must not be null")
    private String name;

    @NotNull(message = "Event's category must not be null")
    private CategoryEnum category;

    @NotNull(message = "Event's type must not be null")
    private EventTypeEnum type;

    @NotNull(message = "Event's desc must not be null")
    private String desc;

    @NotNull(message = "Event's initDate must not be null")
    private Date initDate;

    @NotNull(message = "Event's finishDate must not be null")
    private Date finishDate;

    @NotNull(message = "Event's value must not be null")
    private double value;

    @NotNull(message = "Event's seats must not be null")
    @Range(min = 1)
    private int seats;

    @NotNull(message = "Event's organization must not be null")
    private Organization organization;

    @NotNull(message = "Event's address must not be null")
    private Address address;

    private EventStatusEnum status;
    private User responsible;
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
