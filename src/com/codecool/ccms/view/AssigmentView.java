package com.codecool.ccms.view;

import com.codecool.ccms.model.*;
import java.util.*;

public class AssigmentView {

    public void displayAssigment(String title, String URLadress, String studentEmail, Boolean submitted, String grade) {
        if (isNewAssigment(studentEmail)) {
            System.out.println(getBasicData(title, URLadress));
        } else if (isNotSubmitted(studentEmail, submitted)) {
            System.out.println("Student: " + studentEmail + "\n" + getBasicData(title, URLadress));
        } else if (isNotGraded(studentEmail, submitted, grade)) {
            System.out.println("Student: " + studentEmail + "\n" + getBasicData(title, URLadress) + "\n" + "Not yet graded");
        } else if (isGraded(studentEmail, submitted, grade)) {
            System.out.println("Student: " + studentEmail + "\n" + getBasicData(title, URLadress) + "\n" + "Grade :" + grade);
        }
    }

    private String getBasicData(String title, String URLadress) {
        return "Assigment's title: " + title + "\nURL: " + URLadress;
    }

    private boolean isNewAssigment(String email) {
        if (email.equals(null)) {
            return true;
        } else return false;
    }

    private boolean isNotSubmitted(String email, Boolean submitted) {
        if (!email.equals(null) && submitted.equals(null)) {
            return true;
        } else return false;
    }

    private boolean isNotGraded(String email, Boolean submitted, String grade) {
        if (!email.equals(null) && submitted.equals(null) && grade.equals(null)) {
            return true;
        } else return false;
    }

    private boolean isGraded(String email, Boolean submitted, String grade) {
        if (!email.equals(null) && !submitted.equals(null) && !grade.equals(null)) {
            return true;
        } else return false;
    }
}