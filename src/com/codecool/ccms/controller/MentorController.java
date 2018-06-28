package com.codecool.ccms.controller;

import com.codecool.ccms.model.*;
import com.codecool.ccms.view.*;

import java.util.*;

public class MentorController {

    private Mentor mentor;
    private MentorView view;

    private List<Assigment> templateAssigments;
    private List<Assigment> assigmentsFromStudents;

    public MentorController(Mentor mentor) {
        this.mentor = mentor;
        this.view = new MentorView();
        this.templateAssigments = new ArrayList<>();
        this.assigmentsFromStudents = new ArrayList<>();
    }

    private void addAssigment() {
        this.view.getAssigmentData();
        this.templateAssigments.add(new Assigment(view.getInput1(), view.getInput2()));
    }

    private void gradeAssigment(String email, String URLadress) {
        Assigment assigment = findAssigment(email, URLadress);
        if (assigment.equals(null)) {
            this.view.printMessage("No such assigment is available to grade.");
        } else {
            this.view.getData("Insert grade:");
            assigment.setGrade(view.getInput1());
        }
    }

    private Assigment findAssigment(String email, String URLadress) {
        for (Assigment assigment: assigmentsFromStudents) {
            if (assigment.getStudentEmail().equals(email) && assigment.getURLadress().equals(URLadress)) {
                return assigment;
            }
        }
        return null;
    }

    private void addStudentToClass() {

    }

    private void findStudent() {}

}