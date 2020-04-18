package com.fatec.zevent.DTO.ActivityType;

import com.fatec.zevent.model.ActivityType;

public class ActivityTypeToAddDTO {
    private String eventId;
    private ActivityType activityType;

    public String getEventId() {
        return eventId;
    }

    public ActivityTypeToAddDTO setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public ActivityTypeToAddDTO setActivityType(ActivityType activityType) {
        this.activityType = activityType;
        return this;
    }
}
