package com.lowes.geeksforlowes.controller;

import com.lowes.geeksforlowes.model.Event;
import com.lowes.geeksforlowes.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Controller
@RequestMapping("geeksforlowes/event")
public class EventController {

    @Autowired
    EventServiceImpl eventService ;

    @RequestMapping(value = "/viewEventByID", method = RequestMethod.GET)
    public  @ResponseBody Event viewEvent(
            @PathVariable("eventId") Integer eventId,
            @RequestHeader("loggedInMemberId") Integer loggedInMemberId) {

        Event event = eventService.getEventById(eventId);
        return event;

    }

    @RequestMapping(value = "/viewTrendingEvent", method = RequestMethod.GET)
    public  @ResponseBody Event viewTrendingEvent(
            @RequestHeader("loggedInMemberId") Integer loggedInMemberId) {

        Event event = eventService.getTrendingEvent();
        return event;

    }

    @RequestMapping(value = "/viewPopularEvent", method = RequestMethod.GET)
    public  @ResponseBody Event viewPopularEvent(
            @RequestHeader("loggedInMemberId") Integer loggedInMemberId) {

        Event event = eventService.getPopularEvent();
        return event;

    }

    @RequestMapping(value = "/viewUpcomingEvent", method = RequestMethod.GET)
    public  @ResponseBody Event viewUpcomingEvent(
            @RequestHeader("loggedInMemberId") Integer loggedInMemberId) {

        Event event = eventService.getUpcomingEvent();
        return event;

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public  @ResponseBody String addEvent(
            @RequestBody Event event,
            @RequestHeader("loggedInMemberId") Integer loggedInMemberId) throws ParseException {

        String response = eventService.addEvent(event);
        return response;

    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public  @ResponseBody Event updateEvent(
            @PathVariable("eventId") Integer eventId,
            @RequestHeader("loggedInMemberId") Integer loggedInMemberId) {

        Event event = eventService.updateEvent(eventId);
        return event;

    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public  @ResponseBody Event deleteEvent(
            @PathVariable("eventId") Integer eventId,
            @RequestHeader("loggedInMemberId") Integer loggedInMemberId) {

        Event event = eventService.deleteEvent(eventId);
        return event;

    }


}
