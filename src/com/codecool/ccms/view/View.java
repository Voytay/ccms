package com.codecool.ccms.view;

import com.codecool.ccms.model.*;
import java.util.*;

abstract public class View {

    protected Scanner read;
    protected String input1;
    protected String input2;
    protected String input3;

    public View() {
        this.read = new Scanner(System.in);
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

    protected void clearInput() {
        this.input1 = "";
        this.input2 = "";
        this.input3 = "";
    }
}

