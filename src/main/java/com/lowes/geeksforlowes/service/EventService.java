package com.lowes.geeksforlowes.service;

import com.lowes.geeksforlowes.model.Event;

import java.text.ParseException;

public interface EventService {
    Event getEventById(Integer eventId);

    Event getTrendingEvent();

    Event getPopularEvent();

    Event getUpcomingEvent();

    String addEvent(Event event) throws ParseException;

    Event updateEvent(Integer eventId);

    Event deleteEvent(Integer eventId);
}
