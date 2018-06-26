package com.codecool.ccms.controller;

import com.codecool.ccms.model.*;
import com.codecool.ccms.view.*;

import java.util.ArrayList;
import java.util.List;

public class ManagerController {

    private List<User> mentorsList;
    private List<User> studentsList;

    private Manager manager;
    private ManagerView view;

    public ManagerController(Manager manager) {
        this.manager = manager;
        this.view = new ManagerController();
        this.mentorsList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
    }

    public List<User> setMentorsList(List<User> mentorsList) {
        this.mentorsList = mentorsList;
    }

    public List<User> setStudentsList(List<User> studentsList) {
        this.studentsList = studentsList;
    }

    private Mentor findMentor(String email) {
        for (User mentor: this.mentorsList) {
            if (mentor.getEmail().equals(email)) {
                return mentor;
            }
        }
        return null;
    }

    private void addMentor() {
        this.view.getMentorData();
        this.mentorsList.add(new Mentor(view.getInput1(), view.getInput2()));
    }

}