package com.fatec.zevent.DTO.Activity;

import com.fatec.zevent.model.Activity;
import com.fatec.zevent.model.ActivityType;

public class ActivityToAddDTO {
    private String eventId;
    private Activity activity;
    private String activityTypeName;

    public String getEventId() {
        return eventId;
    }

    public ActivityToAddDTO setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public Activity getActivity() {
        return activity;
    }

    public ActivityToAddDTO setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public String getActivityTypeName() {
        return activityTypeName;
    }

    public ActivityToAddDTO setActivityType(String activityTypeName) {
        this.activityTypeName = activityTypeName;
        return this;
    }
}
