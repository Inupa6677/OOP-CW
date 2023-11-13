package com.example.oop_cw_v1;

public class Workshop extends Event {

    private String conductor;

    public Workshop(String eventName, String eventDate, String eventTime, String conductor){
        super(eventName, eventDate, eventTime);
        this.conductor = conductor;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    @Override
    public void displayEventDetails(){
        super.displayEventDetails();
        System.out.println("conductor: " + conductor);
    }


}
