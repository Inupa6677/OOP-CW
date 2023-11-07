package com.example.oop_cw_v1;

import java.util.Date;

public class Student extends User{

    // Student's unique attributes
    private String studentID;

    //parameterized constructor


    public Student(String firstName, String lastName, String gender, String DoB, String contactNumber, String email, String password,String studentID) {
        super(firstName, lastName, gender, DoB, Integer.parseInt(contactNumber),email,password);
        this.studentID = studentID;
    }


    // getters and setters for studentID


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public boolean display(){
        System.out.println("HiHi");
        return false;
    };

}
