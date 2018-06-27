package com.codecool.ccms.views;

import com.codecool.ccms.models.*;
import java.util.*;

abstract public class View {

    protected Scanner read;

    public View() {
        this.read = new Scanner(System.in);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printNoResult() {
        System.out.println("No matching results found.");
    }

    public void printUserData(User user) {
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("\n");
    }
}

