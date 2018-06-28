package com.codecool.ccms.controller;

import com.codecool.ccms.DataBase;
import com.codecool.ccms.model.Manager;
import com.codecool.ccms.model.Mentor;
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
        DataBase db = new DataBase();
        int userType = -1;
        List<String> usersData = db.readDataFromFile("ccmsdata.csv");
        ArrayList<String> data = LOGIN_VIEW.getAuthData();
        for (String line : usersData) {
            String[] splitedLine = line.split(",");
            if (splitedLine[1].equals(data.get(0)) && splitedLine[2].equals(data.get(1))) {
                userType = Integer.valueOf(splitedLine[3]);
            }
            switch (userType) {
                case 0:
                    // StudentController sc = new StudentController(new Student(line.get(0), line.get(1)));
                    //sc.run();
                    break;
                case 1:
                    SecretaryController sc = new SecretaryController();
                    sc.run();
                    break;
                case 2:
                    MentorController mc = new MentorController(new Mentor("Mentor1", "mentor@codecool"));
                    mc.run();
                    break;
                case 3:
                    System.out.println("OK");
                    ManagerController manC = new ManagerController(new Manager("Jurek", "jurek@cms.codecool"));
                    manC.run();
                    break;
                default:
                    System.out.println("Invalid user or password! \nExiting system");
                    System.exit(0);
            }
        }
    }


    public void run() {
        authUser();
    }
}
