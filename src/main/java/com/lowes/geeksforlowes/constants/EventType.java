package com.lowes.geeksforlowes.constants;

import com.lowes.geeksforlowes.model.Event;

public enum EventType {
    Org, Team, Private;

    public static String getEventType(EventType eventType) {
        if(eventType.equals(EventType.Org)) {
            return  EventType.Org.toString();
        } else if(eventType.equals(EventType.Team)) {
            return EventType.Team.toString();
        } else {
            return EventType.Private.toString();
        }

    }
}
