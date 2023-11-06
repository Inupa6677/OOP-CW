package com.example.oop_cw_v1;

import java.util.Date;

public class Advisor extends User{
    private  String advisorID;
    public Advisor(String firstName,String lastName,String gender, String DoB,int contactNumber,String email,String password,String advisorID) {
        super(firstName, lastName, gender, DoB,contactNumber,email,password);
        this.advisorID = advisorID;
    }

    @Override
    public boolean display() {
        System.out.println("HI");
        return false;
    }
}
