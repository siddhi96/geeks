package com.lowes.geeksforlowes.service;

import com.lowes.geeksforlowes.constants.EventType;
import com.lowes.geeksforlowes.model.Event;
import com.lowes.geeksforlowes.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class EventServiceImpl implements EventService{

    static final String CANNOT_CREATE_EVENT = "Event start date is prior to the allowed date.";
    static final String EVENT_ALREADY_PRESENT = "Event already exists";
    static final String EVENT_CREATED = "Event was successfully created";

    @Autowired
    EventRepository eventRepository;

    @Override
    public Event getEventById(Integer eventId) {
        return null;
    }

    @Override
    public Event getTrendingEvent() {
        return null;
    }

    @Override
    public Event getPopularEvent() {
        return null;
    }

    @Override
    public Event getUpcomingEvent() {
        return null;
    }

    @Override
    public String addEvent(Event event) throws ParseException {
        boolean canCreate = canCreateEvent(event.getEventType(), event.getStartDate());
        if(!canCreate) {
            return CANNOT_CREATE_EVENT;
        } else if(eventRepository.exists(event.getEventId())) {
            return EVENT_ALREADY_PRESENT;
        } else {
            eventRepository.save(event);
            return EVENT_CREATED;
        }
    }

    @Override
    public Event updateEvent(Integer eventId) {
        return null;
    }

    @Override
    public Event deleteEvent(Integer eventId) {
        return null;
    }

    private boolean canCreateEvent(EventType eventType, String startDate) throws ParseException {
        int diffInDays = getDiffInDays(startDate);
        System.out.println(diffInDays);
        if(eventType.equals(EventType.Org) && diffInDays >= 60) {
            return true;
        } else if(eventType.equals(EventType.Team) && diffInDays >= 7) {
            return true;
        } else if(eventType.equals(EventType.Private) && diffInDays >= 2) {
            return true;
        } else {
            return  false;
        }
    }

    private int getDiffInDays(String startDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date startingDate = dateFormat.parse(startDate);
        Date currentDate = new Date();
        /*System.out.println(currentDate.getTime());
        System.out.println(startingDate.getTime());*/
        long diff = startingDate.getTime() - currentDate.getTime();
        //System.out.println(diff);
        int diffInDays = (int) (diff/(1000*60*60*24));
        return diffInDays;
    }
}
