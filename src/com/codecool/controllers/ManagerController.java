package com.codecool.ccsm.controllers;

import com.codecool.ccsm.models.*;
import com.codecool.ccsm.views.*;

public class ManagerController {

    private List<User> mentorsList;
    private List<User> studentsList;

    private Manager manager;

    public ManagerController(Manager manager) {
        this.manager = manager;
        this.mentorsList = new ArrayList();
        this.studentsList = new studentsList();
    }

    public setMentorsList(List<User> mentorsList) {
        this.mentorsList = mentorsList;
    }

    public setStudentsList(List<User> studentsList) {
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

}