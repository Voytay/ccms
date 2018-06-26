package com.codecool.ccms.view;

import com.codecool.ccms.Utility;
import java.util.ArrayList;

public class MainView {
    public MainView() {
    }

    public ArrayList<String> getAuthData() {
        Utility ut = new Utility();
        ArrayList<String> data = new ArrayList<>();
        data.add(ut.getUserInput("Enter your email: "));
        data.add(ut.getUserInput("Enter your password: "));
        return data;
    }
}
