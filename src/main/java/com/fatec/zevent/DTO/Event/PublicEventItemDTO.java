package com.fatec.zevent.DTO.Event;

import java.util.Date;

public class PublicEventItemDTO {
    private String name;
    private Date initDate;
    private int seats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
