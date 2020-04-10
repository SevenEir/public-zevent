package com.fatec.zevent.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fatec.zevent.model.enumeration.GenderEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "users")
public class User {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private String id;
    private String name;
    private Date birthday;
    private String role;
    private GenderEnum gender;
    private int phone;
    private String email;
    private List<Event> subscribedEvents;
    private List<Activity> subscribedActivities;
    private List<Checkpoint> checkpoints;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public User setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getRole() {
        return role;
    }

    public User setRole(String role) {
        this.role = role;
        return this;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public User setGender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    public int getPhone() {
        return phone;
    }

    public User setPhone(int phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<Event> getSubscribedEvents() {
        return subscribedEvents;
    }

    public User setSubscribedEvents(List<Event> subscribedEvents) {
        this.subscribedEvents = subscribedEvents;
        return this;
    }

    public List<Activity> getSubscribedActivities() {
        return subscribedActivities;
    }

    public User setSubscribedActivities(List<Activity> subscribedActivities) {
        this.subscribedActivities = subscribedActivities;
        return this;
    }

    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

    public User setCheckpoints(List<Checkpoint> checkpoints) {
        this.checkpoints = checkpoints;
        return this;
    }
}
