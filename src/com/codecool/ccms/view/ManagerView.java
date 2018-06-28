package com.codecool.ccms.view;

import com.codecool.ccms.model.*;
import java.util.*;

public class ManagerView extends View {

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

    

}