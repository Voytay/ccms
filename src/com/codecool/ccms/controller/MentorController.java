package com.codecool.ccms.controllers;

import com.codecool.ccms.models.*;
import com.codecool.ccms.views.*;

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

}