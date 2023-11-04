package com.example.oop_cw_v1;

import java.util.Date;

public class Advisor extends User{
    private  String advisorID;
    public Advisor(String firstName, String lastName, String gender, String DoB,String email, int contactNumber,String advisorID) {
        super(firstName, lastName, gender, DoB,email, contactNumber);
        this.advisorID = advisorID;
    }

    @Override
    public boolean display() {
        System.out.println("HI");
        return false;
    }
}
