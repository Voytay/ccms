package com.codecool.ccms.controller;

import com.codecool.ccms.model.User;
import com.codecool.ccms.view.SecretaryView;

import java.util.ArrayList;
import java.util.List;

public class SecretaryController {
    private static final SecretaryView SECRETARY_VIEW = new SecretaryView();
    private ArrayList<String> menu = new ArrayList<>();

    public SecretaryController(){
        menu.add("1. Show student list");
        menu.add("2. Exit");
    }

    private void showStudentList(List<User> data){
        for(User u: data){
            SECRETARY_VIEW.printUserData(u);
        }
    }

    public void run(){
        int decision = 0;
        while(decision<1 || decision >2){
            SECRETARY_VIEW.printMenu(menu);
            decision = SECRETARY_VIEW.getUserInputInt();
            switch(decision){
                case 1:
                    //showStudentList(data);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("No such option!");
            }
        }
    }
}
