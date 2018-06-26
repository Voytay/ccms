package com.codecool.ccms.model;

abstract class User {

    protected String name;
    protected String email;
    protected Status status;

    public User(String name, String email, Status status) {
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}