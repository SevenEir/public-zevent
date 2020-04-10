package com.fatec.zevent.model;

import com.fatec.zevent.model.enumeration.CategoryEnum;

public class Stand implements Checkable {
    private String name;
    private CategoryEnum category;
    private String desc;
    private int points;
    private Organization organization;
    private User responsible;

    public String getName() {
        return name;
    }

    public Stand setName(String name) {
        this.name = name;
        return this;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public Stand setCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    public Organization getOrganization() {
        return organization;
    }

    public Stand setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

    public User getResponsible() {
        return responsible;
    }

    public Stand setResponsible(User responsible) {
        this.responsible = responsible;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Stand setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public int getPoints() {
        return points;
    }

    public Stand setPoints(int points) {
        this.points = points;
        return this;
    }
}
