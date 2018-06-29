package com.codecool.ccms.controller;

import com.codecool.ccms.model.*;
import com.codecool.ccms.view.*;

import java.util.*;

public class ManagerController {
    private static final ManagerView MANAGER_VIEW = new ManagerView();

    private List<User> mentorsList;
    private List<User> studentsList;

    private Manager manager;


    public ManagerController(Manager manager) {
        this.manager = manager;
        this.mentorsList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
    }

    public void setMentorsList(List<User> mentorsList) {
        this.mentorsList = mentorsList;
    }

    public void setStudentsList(List<User> studentsList) {
        this.studentsList = studentsList;
    }

    private User findMentor(String email) {
        for (User mentor: this.mentorsList) {
            if ( mentor.getEmail().equals(email)) {
                return mentor;
            }
        }
        return null;
    }

    private void addMentor() {
        this.MANAGER_VIEW.getMentorData();
        this.mentorsList.add(new Mentor(MANAGER_VIEW.getInput1(), MANAGER_VIEW.getInput2())); // or reloading database !!!
        // add new mentor to database with PASSWORD = view.getInput3()
    }

    private void removeMentor() {
        this.MANAGER_VIEW.getData("Insert mentor's email:");
        // remove mentor from database, reload
    }

    private void editMentorsData() {
        this.MANAGER_VIEW.getData("Insert mentors email:");
        Mentor mentor = (Mentor) findMentor(MANAGER_VIEW.getInput1());
        if (mentor.equals(null)) {
            this.MANAGER_VIEW.printNoResult();
        } else {
            chooseDataToChange(mentor);
        }
    }

    private void chooseDataToChange(Mentor mentor) {
        //this.view.printMenu();                   implement method !!!
        this.MANAGER_VIEW.getData("What do you want to change?");
        changeData(mentor);
    }

    private void changeData(Mentor mentor) {
        switch (MANAGER_VIEW.getInput1()) {
                case "1":
                    this.MANAGER_VIEW.getData("Insert new name:");
                    mentor.setName(MANAGER_VIEW.getInput1());
                    break;
                case "2":
                    this.MANAGER_VIEW.getData("Insert new email:");
                    mentor.setEmail(MANAGER_VIEW.getInput1());
                    break;
        }  
    } 

    private void seeMentorsList() {
        if (this.mentorsList.isEmpty()) {
            this.MANAGER_VIEW.printMessage("The list is empty.");
        } else {
            this.MANAGER_VIEW.printMessage("List of mentors: \n");
            for (User mentor: this.mentorsList) {
                this.MANAGER_VIEW.printUserData(mentor);
            }
        }
    }
    public void run(){}
}