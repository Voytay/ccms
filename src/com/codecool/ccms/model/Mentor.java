package com.codecool.ccms.model;

public class Mentor extends User {

    public Mentor(String name, String email) {
        super(name, email, Status.STAT_2);
    }

}