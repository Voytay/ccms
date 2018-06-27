package com.codecool.ccsm.controllers;

import com.codecool.ccsm.models.*;
import com.codecool.ccsm.views.*;

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

    private void addMentor() {
        this.view.getMentorData();
        this.mentorsList.add(new Mentor(view.getInput1(); view.getInput2())); // or reloading database !!!
        // add new mentor to database with PASSWORD = view.getInput3()
    }

    private void removeMentor() {
        this.view.getData("Insert mentor's email:");
        // remove mentor from database, reload
    }

    private void eidtMentorsData() {
        this.view.getData("Insert mentors email:");
        Mentor mentor = findMentor(view.getInput1);
        if (mentor.equals(null)) {
            this.view.printNoResult();
        } else {
            chooseDataToChange(mentor);
        }
    }

    private void chooseDataToChange(Mentor mentor) {
        this.view.printMenu();
        this.view.getData("What do you want to change?");
        changeData(mentor);
    }

    private void changeData(Mentor mentor) {
        switch (view.getInput1()) {
                case "1":
                    this.view.getData("Insert new name:");
                    mentor.setName(view.getInput1);
                    break;
                case "2":
                    this.view.getData("Insert new email:");
                    mentor.setEmail(view.getInput1);
                    break;
        }  
    }          
}