package com.example.oop_cw_v1;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class AttendanceData {
    private final SimpleStringProperty studentID;
    private final SimpleStringProperty studentName;
    private final SimpleBooleanProperty attendance;

    public AttendanceData(String studentID, String studentName, boolean attendance) {
        this.studentID = new SimpleStringProperty(studentID);
        this.studentName = new SimpleStringProperty(studentName);
        this.attendance = new SimpleBooleanProperty(attendance);
    }

    public String getStudentID() {
        return studentID.get();
    }

    public SimpleStringProperty studentIDProperty() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID.set(studentID);
    }

    public String getStudentName() {
        return studentName.get();
    }

    public SimpleStringProperty studentNameProperty() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName.set(studentName);
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

}

