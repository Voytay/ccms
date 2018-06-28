package com.codecool.ccms.controller;

import com.codecool.ccms.model.Student;
import com.codecool.ccms.view.*;

import java.util.ArrayList;

public class StudentController extends View {
    private static final StudentView STUDENT_VIEW = new StudentView();
    private ArrayList<String> menu = new ArrayList<>();
    private Student student;

    public StudentController(Student student) {
        this.student = student;
        menu.add("Submit assigment");
        menu.add("Show grades");
        menu.add("Exit");
    }

    private void printMenuOptions(ArrayList<String> data) {
        STUDENT_VIEW.printOptions(data);
    }

    private void submitAssigment(String data) {

    }

    private void showGrades() {
    }

    public void run() {

        int decision = 0;
        while (decision < 1 || decision > 3) {
            printMenuOptions(menu);
            decision = STUDENT_VIEW.getUserInput();
            switch (decision) {
                case 1:
                    submitAssigment("a");
                    break;
                case 2:
                    showGrades();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No such option!");
            }
        }
    }


}
