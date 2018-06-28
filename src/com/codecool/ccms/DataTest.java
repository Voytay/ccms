package com.codecool.ccms;

import com.codecool.ccms.controller.*;
import com.codecool.ccms.model.*;
import com.codecool.ccms.view.*;

import java.util.*;

public class DataTest {

    public static void main (String[] args) {
        DataBase base = new DataBase("ccms_data.csv");
        for (String data: base.getData()) {
            System.out.println(data);
        }
    }
}
