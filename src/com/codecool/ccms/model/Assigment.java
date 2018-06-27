package com.codecool.ccms.models;

public class Assigment{
    private String title;
    private String URLadress;
    private String studentEmail;
    private Boolean submitted;
    private String grade;

    public Assigment(String title, String URLadress) {
        this.title = title;
        this.URLadress = URLadress;
        this.studentEmail = null;
        this.submitted = null;
        this.grade = null;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getURLadress() {
        return this.URLadress;
    }

    public void setURLadress(String URLadress) {
        this.URLadress = URLadress;
    }

    public String getStudentEmail() {
        return this.studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Boolean getSubmitted() {
        return this.submitted;
    }

    public void setSubmitted(Boolean submitted) {
        this.submitted = submitted;
    }


    
}