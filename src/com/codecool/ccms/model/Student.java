package com.codecool.ccms.model;


public class Student extends User {

    private boolean activated;

    public Student(String name, String email, boolean activated) {
        super(name, email, Status.STAT_0);
        this.activated = activated;
    }

    public boolean getActivated() {
        return this.activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}