package com.codecool.ccms.view;

import java.util.ArrayList;

public class LoginView extends AppView {

    public ArrayList<String> getAuthData() {
        ArrayList<String> data = new ArrayList<>();
        data.add(getUserInput("Enter your email: "));
        data.add(getUserInput("Enter your password: "));
        return data;
    }
}
