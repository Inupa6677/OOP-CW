package com.example.oop_cw_v1;

public class Student extends User{

    // Student's unique attributes
    private String studentID;

    //parameterized constructor
    public Student(String firstName, String lastName, String gender, String DoB, String email, int contactNumber, String studentID) {
        super(firstName, lastName, gender, DoB,email, contactNumber);
        this.studentID = studentID;
    }

    @Override
    public boolean display(){
        System.out.println("Hello");
        return false;
    };
}
