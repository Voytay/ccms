package com.codecool.ccsm.models;

public class Mentor extends User {

    public Mentor(String name, String email) {
        super(name, email, Status.STAT_2);
    }

}