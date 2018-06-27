package com.codecool.ccsm.models;

public class Manager extends User {

    public Manager(String name, String email) {
        super(name, email, Status.STAT_3);
    }

}