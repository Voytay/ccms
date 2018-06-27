package com.codecool.ccms.models;

public class Manager extends User {

    public Manager(String name, String email) {
        super(name, email, Status.STAT_3);
    }

}