package com.lowes.geeksforlowes.model;

import com.lowes.geeksforlowes.constants.EventType;
import com.lowes.geeksforlowes.constants.RecurringFrequency;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Event {

    @Id
    private int eventId;

    @NotNull
    private String eventName;

    @OneToOne
    @JoinColumn(name = "memberId")
    private OrgMember createMember;

    private EventType eventType;
    private RecurringFrequency recurringFrequency;
    private String location;
    private String startDate;
    private String endDate;
    private int numberOfLikes;
    private int numberOfWatchers;
    private int numberOfViews;
    private int numberOfParticipants;
    private boolean recurring;

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public RecurringFrequency getRecurringFrequency() {
        return recurringFrequency;
    }

    public void setRecurringFrequency(RecurringFrequency recurringFrequency) {
        this.recurringFrequency = recurringFrequency;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public OrgMember getOrgMember() {
        return createMember;
    }

    public void setOrgMember(OrgMember OrgMember) {
        this.createMember = createMember;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfWatchers() {
        return numberOfWatchers;
    }

    public void setNumberOfWatchers(int numberOfWatchers) {
        this.numberOfWatchers = numberOfWatchers;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public boolean isRecurring() {
        return recurring;
    }
    public void setRecurring(boolean recurring) {
        this.recurring = recurring;
    }


}
