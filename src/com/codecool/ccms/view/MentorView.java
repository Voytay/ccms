package com.codecool.ccms.views;

import com.codecool.ccms.models.*;
import java.util.*;

public class MentorView extends View {

    public MentorView() {
        super();
    }

    public void getAssigmentData() {
        clearInput();
        System.out.println("Insert assigment's title:");
        this.input1 = read.nextLine();
        System.out.println("Insert assigment's URL:");
        this.input2 = read.nextLine();
    }
}