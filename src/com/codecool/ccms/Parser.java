package com.codecool.ccms;

import com.codecool.ccms.model.*;

import java.util.*;

public class Parser {

    private DataBase base;
    private final int namePosition = 0;
    private final int emailPosition = 1;
    private final int passwordPosition = 2;
    private final int statusPosition = 3;
    private final int activatedPosition = 4;

    public Parser() {
        this.base = new DataBase();
    }

    public List<Student> getStudentsList() {
        List<String> data = base.readDataFromFile("ccmsdata.csv");
        List<Student> list = new ArrayList<>();
        for (String line: data) {
            String arr[] = line.split(",");
            if (Integer.valueOf(arr[statusPosition]) == Status.STAT_0.getStatus() && Integer.valueOf(arr[activatedPosition]) == 0) {
                list.add(new Student(arr[namePosition], arr[emailPosition], false));
            } else if (Integer.valueOf(arr[statusPosition]) == Status.STAT_0.getStatus() && Integer.valueOf(arr[activatedPosition]) == 1) {
                list.add(new Student(arr[namePosition], arr[emailPosition], true));
            }
        }
        return list;
    }

    public List<Mentor> getMentorsList() {
        List<String> data = base.readDataFromFile("ccmsdata.csv");
        List<Mentor> list = new ArrayList<>();
        for (String line: data) {
            String arr[] = line.split(",");
            if (Integer.valueOf(arr[statusPosition]) == Status.STAT_2.getStatus()) {
                list.add(new Mentor(arr[namePosition], arr[emailPosition]));
            }
        }
        return list;
    }
}