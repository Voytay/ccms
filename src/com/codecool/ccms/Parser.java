package com.codecool.ccms;

import com.codecool.ccms.model.*;

import java.util.*;

public class Parser {

    private DataBase base;
    private final namePosition = 0;
    private final emailPosition = 1;
    private final passwordPosition = 2;
    private final statusPosition = 3;
    private final activatedPosition = 4;

    public DataBase() {
        this.base = new DataBase();
    }

    public List<Student> getStudentsList() {
        List<String> data = base.readDataFromFile("ccmsdata.csv");
        for (String line: base) {
            String arr[] = line.split(",");
            if (arr[statusPosition] == Status.STAT_0.getStatus() && arr[activatedPosition] == 0) {
                data.add(new Student(arr[namePosition], arr[emailPosition], false));
            } else if (arr[statusPosition] == Status.STAT_0.getStatus() && arr[activatedPosition] == 1) {
                data.add(new Student(arr[namePosition], arr[emailPosition], true));
            }
        }
        return data;
    }

    public List<Student> getMentorsList() {
        List<String> data = base.readDataFromFile("ccmsdata.csv");
        for (String line: base) {
            String arr[] = line.split(",");
            if (arr[statusPosition] == Status.STAT_2.getStatus()) {
                data.add(new Mentor(arr[namePosition], arr[emailPosition]));
        }
        return data;
    }
}