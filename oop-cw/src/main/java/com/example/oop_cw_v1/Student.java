package com.example.oop_cw_v1;

public class Student extends User{

    // Student's unique attributes
    private String studentID;

    //parameterized constructor
    public Student(String firstName,String lastName,String gender, String DoB,int contactNumber,String email,String password, String studentID) {
        super(firstName, lastName, gender, DoB,contactNumber,email,password);
        this.studentID = studentID;
    }

    @Override
    public boolean display(){
        System.out.println("Hello");
        return false;
    };
}
