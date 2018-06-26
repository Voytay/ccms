package com.codecool.ccsm.controllers;

import com.codecool.ccsm.models.*;
import com.codecool.ccsm.views.*;
import java.util.*;

public class ManagerView() {

    private Scanner read;
    private String input1;
    private String input2;

    public ManagerView() {
        this.read = new Scanner(System.in);
    }

    public getMentorData() {
        clearInput();
        System.out.println("Insert mentor's name:");
        this.input1 = read.nextLine();
        System.out.println("Insert mentor's email:");
        this.input2 = read.nextLine();
    }

    public String getInput1() {
        return this.input1;
    }

    public String getInput2() {
        return this.input2;
    }

    private void clearInput() {
        this.input1 = "";
        this.input2 = "";
    }

}