package com.codecool.ccms.view;

import com.codecool.ccms.model.*;
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