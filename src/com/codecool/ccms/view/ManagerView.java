package com.codecool.ccms.views;

import com.codecool.ccms.models.*;
import java.util.*;

public class ManagerView extends View {

    private String input1;
    private String input2;
    private String input3;

    public ManagerView() {
        super();
    }

    public void getMentorData() {
        clearInput();
        System.out.println("Insert mentor's name:");
        this.input1 = read.nextLine();
        System.out.println("Insert mentor's email:");
        this.input2 = read.nextLine();
        System.out.println("Insert email's password:");
        this.input3 = read.nextLine();
    }

    public String getInput1() {
        return this.input1;
    }

    public String getInput2() {
        return this.input2;
    }

    public String getInput3() {
        return this.input3;
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

    public void getData(String message) {
        clearInput();
        printMessage(message);
        this.input1 = read.nextLine();
    }

    private void clearInput() {
        this.input1 = "";
        this.input2 = "";
        this.input3 = "";
    }

}