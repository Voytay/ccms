package com.codecool.ccms.controller;

import com.codecool.ccms.model.*;
import com.codecool.ccms.view.*;

import java.util.*;

public class MentorController {

    private Mentor mentor;
    private static final MentorView MENTOR_VIEW = new MentorView();

    private List<Assigment> templateAssigments;
    private List<Assigment> assigmentsFromStudents;

    public MentorController(Mentor mentor) {
        this.mentor = mentor;
        this.templateAssigments = new ArrayList<>();
        this.assigmentsFromStudents = new ArrayList<>();
    }

    private void addAssigment() {
        this.MENTOR_VIEW.getAssigmentData();
        this.templateAssigments.add(new Assigment(MENTOR_VIEW.getInput1(), MENTOR_VIEW.getInput2()));
    }

    private void gradeAssigment(String email, String URLadress) {
        Assigment assigment = findAssigment(email, URLadress);
        if (assigment.equals(null)) {
            this.MENTOR_VIEW.printMessage("No such assigment is available to grade.");
        } else {
            this.MENTOR_VIEW.getData("Insert grade:");
            assigment.setGrade(MENTOR_VIEW.getInput1());
        }
    }

    private Assigment findAssigment(String email, String URLadress) {
        for (Assigment assigment : assigmentsFromStudents) {
            if (assigment.getStudentEmail().equals(email) && assigment.getURLadress().equals(URLadress)) {
                return assigment;
            }
        }
        return null;
    }

    private void addStudentToClass() {

    }

    //private Student findStudent() {}
    public void run() {
    }
    private void findStudent() {}

}