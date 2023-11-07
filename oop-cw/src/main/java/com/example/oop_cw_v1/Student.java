package com.example.oop_cw_v1;

import java.util.Date;

public class Student extends User{

    // Student's unique attributes
    private String studentID;

    //parameterized constructor
    public Student(String firstName, String lastName, String gender, Date DoB, int contactNumber, String email, String password) {
        super(firstName, lastName, gender, String.valueOf(DoB), contactNumber,email,password);
        this.studentID = studentID;
    }

    public Student(String firstName, String lastName, String gender, String doB, String contactNumber, String email, String password) {
        super();
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
