package com.codecool.ccms;

import com.codecool.ccms.controller.*;
import com.codecool.ccms.model.*;
import com.codecool.ccms.view.*;

import java.util.*;

public class DataTest {

    public static void main (String[] args) {
        DataBase base = new DataBase();
        List<String> data = base.readDataFromFile("ccmsdata.csv");
        for (String dat: data) {
            System.out.println(dat);
        }
    }
}
