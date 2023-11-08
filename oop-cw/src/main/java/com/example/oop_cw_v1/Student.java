package com.example.oop_cw_v1;

import java.util.Date;

public class Student extends User{

    // Student's unique attributes
    private int studentID;

    //parameterized constructor


    public Student(String firstName, String lastName, String gender, String DoB, String contactNumber, String email, String password,int studentID) {
        super(firstName, lastName, gender, DoB, contactNumber,email,password);
        this.studentID = studentID;
    }


    // getters and setters for studentID


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public boolean display(){
        System.out.println("HiHi");
        return false;
    };



}
