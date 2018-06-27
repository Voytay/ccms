package com.codecool.ccsm.controllers;

import com.codecool.ccsm.models.*;
import com.codecool.ccsm.views.*;
import java.util.*;

public class ManagerView() {

    private Scanner read;
    private String input1;
    private String input2;
    private String input3;

    public ManagerView() {
        this.read = new Scanner(System.in);
    }

    public getMentorData() {
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

    public void printNoResult() {
        System.out.println("No matching results found.");
    }

    public String getData(String message) {
        clearInput();
        System.out.println(message);
        this.input1 = read.nextLine();
    }

    private void clearInput() {
        this.input1 = "";
        this.input2 = "";
        this.input3 = "";
    }

}