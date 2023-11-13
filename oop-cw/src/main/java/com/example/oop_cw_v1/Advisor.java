package com.example.oop_cw_v1;

public class Advisor extends User{
    private  String advisorID;
    public Advisor(String firstName, String lastName, String gender, String DoB, String contactNumber, String email, String password, String advisorID) {
        super(firstName, lastName, gender, String.valueOf(DoB),contactNumber,email,password);
        this.advisorID = advisorID;
    }

    // getters and setters for advisor id.


    public String getAdvisorID() {
        return advisorID;
    }

    public void setAdvisorID(String advisorID) {
        this.advisorID = advisorID;
    }

    @Override
    public boolean display() {
        System.out.println("HI");
        return false;
    }
}
