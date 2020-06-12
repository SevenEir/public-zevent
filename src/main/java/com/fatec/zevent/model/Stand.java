package com.fatec.zevent.model;

import com.fatec.zevent.model.enumeration.CategoryEnum;

import javax.validation.constraints.NotNull;

public class Stand implements Checkable {

    @NotNull(message = "Stand's name must not be null")
    private String name;

    @NotNull(message = "Stand's category must not be null")
    private CategoryEnum category;

    @NotNull(message = "Stand's description must not be null")
    private String desc;

    @NotNull(message = "Stand's points must not be null")
    private int points;

    @NotNull(message = "Stand's organization must not be null")
    private Organization organization;

    private String responsibleId;

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

    public String getResponsible() {
        return responsibleId;
    }

    public Stand setResponsible(String responsibleId) {
        this.responsibleId = responsibleId;
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
