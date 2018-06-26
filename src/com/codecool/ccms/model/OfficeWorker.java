package com.codecool.ccms.model;

public class OfficeWorker extends User {

    public OfficeWorker(String name, String email) {
        super(name, email, Status.STAT_1);
    }

}