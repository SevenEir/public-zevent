package com.fatec.zevent.DTO.Stand;

import com.fatec.zevent.model.Stand;

public class StandToAddDTO {

    private String eventId;
    private Stand stand;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }
}
