package com.example.oop_cw_v1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;


public class AttendanceController {
    @FXML
    private Button btn_save;

    @FXML
    private Button btn_search;

    @FXML
    private TableColumn<AttendanceData, Boolean> col_attendance;

    @FXML
    private TableColumn<AttendanceData, String> col_studentID;

    @FXML
    private TableColumn<AttendanceData, String> col_studentName;

    @FXML
    private DatePicker eventAttendanceDate;

    @FXML
    private TableView<AttendanceData> table_attendance;

    @FXML
    private TextField txt_eventSearch;

    private ObservableList<AttendanceData> attendanceDataList;

    public void initialize() {
        // Initialize columns
        col_studentID.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        col_studentName.setCellValueFactory(new PropertyValueFactory<>("studentName"));

        // Column with a custom cell factory for Yes/No
        col_attendance.setCellValueFactory(new PropertyValueFactory<>("attendance"));
        col_attendance.setCellFactory(CheckBoxTableCell.forTableColumn(col_attendance));

        // Make the col_attendance column editable
        col_attendance.setEditable(true);

        // Set TableView selection mode to SINGLE
        table_attendance.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        // Handle onEditCommit event for the col_attendance column
        col_attendance.setOnEditCommit(event -> {
            AttendanceData rowData = event.getRowValue();
            rowData.setAttendance(event.getNewValue());
        });

        // Make the TableView editable
        table_attendance.setEditable(true);

        // Add sample data (replace this with your actual data)
        attendanceDataList = FXCollections.observableArrayList(
                new AttendanceData("123", "John Doe", false),
                new AttendanceData("456", "Jane Doe", false)
        );

        // Add the data to the TableView
        table_attendance.setItems(attendanceDataList);

    }

    @FXML
    private void handleSaveButton() {
        // Iterate through the data list and print the values
        for (AttendanceData data : attendanceDataList) {
            System.out.println("Student ID: " + data.getStudentID() +
                    ", Student Name: " + data.getStudentName() +
                    ", Attendance: " + data.getAttendance());
        }

    }
}
