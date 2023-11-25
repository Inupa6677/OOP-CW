package com.example.oop_cw_v1;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class AttendanceData {
    private final SimpleStringProperty studentID;
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleBooleanProperty attendance;
    private final SimpleStringProperty eventID;

    // Constructor with eventID
    public AttendanceData(String studentID, String firstName, String lastName, boolean attendance, String eventID) {
        this.studentID = new SimpleStringProperty(studentID);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.attendance = new SimpleBooleanProperty(attendance);
        this.eventID = new   SimpleStringProperty(eventID);
    }

    // Constructor without eventID
    public AttendanceData(String studentID, String firstName, String lastName, boolean attendance) {
        this.studentID = new SimpleStringProperty(studentID);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.attendance = new SimpleBooleanProperty(attendance);
        this.eventID = new SimpleStringProperty("");
    }


    // Getters and setters
    public String getStudentID() {
        return studentID.get();
    }

    public SimpleStringProperty studentIDProperty() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID.set(studentID);
    }

    public String getStudentFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty studentFirstNameProperty() {
        return firstName;
    }

    public void setStudentFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getStudentLastName() {
        return lastName.get();
    }

    public SimpleStringProperty studentLastNameProperty() {
        return lastName;
    }

    public void setStudentLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public boolean getAttendance() {
        return attendance.get();
    }

    public SimpleBooleanProperty attendanceProperty() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance.set(attendance);
    }

    public String getEventID() {
        return eventID.get();
    }

    public SimpleStringProperty eventIDProperty() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID.set(eventID);
    }
}

