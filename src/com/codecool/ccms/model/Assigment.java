package com.codecool.ccms.models;

public class Assigment{
    private String URLadress;
    private String studentEmail;
    private Boolean submitted;
    private String grade;

    public Assigment(String URLadress) {
        this.URLadress = URLadress;
        this.studentEmail = null;
        this.submitted = null;
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