package com.fatec.zevent.DTO.Event;

import com.fatec.zevent.model.Address;

import java.util.Date;

public class PublicEventItemDTO {

    private String id;
    private String name;
    private Date initDate;
    private int seats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public PublicEventItemDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Date getInitDate() {
        return initDate;
    }

    public PublicEventItemDTO setInitDate(Date initDate) {
        this.initDate = initDate;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public PublicEventItemDTO setSeats(int seats) {
        this.seats = seats;
        return this;
    }
}
