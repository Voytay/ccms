package com.codecool.ccms.controller;

import com.codecool.ccms.view.AppView;

import java.util.ArrayList;

public class AppController {
    private static final AppView APP_VIEW = new AppView();
    private ArrayList<String> menu = new ArrayList<>();


    public void run(){
        menu.add("Login");
        menu.add("Exit");
        APP_VIEW.printData(menu);
        int decision = APP_VIEW.getUserInput();

        switch(decision){
            case 1:
                LoginController loginController = new LoginController();
                loginController.run();
                break;
            default: System.exit(0);
        }


    }
}
