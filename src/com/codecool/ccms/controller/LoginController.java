package com.codecool.ccms.controller;

import com.codecool.ccms.model.Status;
import com.codecool.ccms.model.Student;
import com.codecool.ccms.view.LoginView;
import com.codecool.ccms.view.SecretaryView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoginController {
    private static final LoginView LOGIN_VIEW = new LoginView();
    // private static final DataManager dm = new DataManager();

    public LoginController() {

    }

    public void authUser() {
        //data manager instance
        ArrayList<List<String>> usersData = dm.getFileData();
        ArrayList<String> data = LOGIN_VIEW.getAuthData();
        for (List<String> line : usersData) {
            if (line.get(1).equals(data.get(0)) && line.get(2).equals(data.get(1))) {
                int userType = Integer.valueOf(line.get(3));
                switch (userType) {
                    case 0:
                        StudentController sc = new StudentController(new Student(line.get(0), line.get(1), ));
                        sc.run();
                        break;
                    case 1:
                        SecretaryController sc = new SecretaryController();
                        sc.run();
                        break;
                    case 2:
                        MentorController mc = new MentorController();
                        mc.run();
                        break;
                    case 3:
                        ManagerController mc = new ManagerController();
                        mc.run();
                        break;
                    default:
                        System.out.println("User do not exist! \nExiting system");
                        System.exit(0);
                }
            }
        }

    }


    public void run() {
        authUser();
    }
}
