package com.codecool.ccms.model;

public class Manager extends User {

    public Manager(String name, String email) {
        super(name, email, Status.STAT_3);
    }

}