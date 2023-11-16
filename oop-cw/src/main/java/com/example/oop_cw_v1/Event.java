package com.example.oop_cw_v1;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String eventId;
    private String eventName;
    private String eventLocation;
    private String eventDescription;

    private String eventDate;
    private String eventTime;

    //constructor with event details created after making the object
    public Event(String eventId, String eventName, String location, String time, String description, String date) {
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName(){
        return eventName;
    }

    public void setEventName (String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate(){
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public Event(String eventName, String eventDate, String eventTime){
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
    }

    public void displayEventDetails(){
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + eventDate);
        System.out.println("Time: " + eventTime);
    }

    private List<Event> events;

    public Event(){
        events = new ArrayList<>();
    }

    // private method that use for internal use to add event
    private void addEvent(Event event) {
        events.add(event);
    }

    // public method to schedule an event
    public void scheduleEvent(Event event) {
        addEvent(event);
        System.out.println("Event scheduled: " + event.getEventName());
    }

    // public method for reschedule event (Update event details)

    public void updateEventDetails(Event event, String newName, String newDate, String newTime) {
        if (events.contains(event)) {
            event.setEventName(newName);
            event.setEventDate(newDate);
            event.setEventTime(newTime);
            System.out.println("Event rescheduled: " + event.getEventName());
        } else {
            System.out.println("Event not found for rescheduling.");
        }
    }

    // public method for cancel events

    public void deleteEvents(Event event){
        if (events.contains(event)){
            events.remove(event);
            System.out.println("Event canceled: " + event.getEventName());
        } else {
            System.out.println("Event not found for cancellation.");
        }
    }

    // common method for handling events

    public void handleEvent(){
        System.out.println("Handling the event: " + eventName);
    }







}
