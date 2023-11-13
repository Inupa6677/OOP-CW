package com.example.oop_cw_v1;

public class Meeting extends Event {
    private String location;

    public Meeting(String EventName, String EventDate, String EventTime, String location){
        super(EventName, EventDate, EventTime);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void displayEventDetails(){
        super.displayEventDetails();
        System.out.println("Location: " + location);
    }

    
}
