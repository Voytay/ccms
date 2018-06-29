package com.codecool.ccms.controller;

import com.codecool.ccms.*;
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
                Parser parser = new Parser();
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
                        Mentor mentor = new Mentor(splitedLine[0], splitedLine[1]);
                        MentorController mc = new MentorController(mentor);
                        mc.setStudentsList(parser.getStudentsList());
                        mc.run();
                        break;
                    case 3:
                        System.out.println("OK");
                        ManagerController manC = new ManagerController(new Manager("Jurek", "jurek@cms.codecool"));
                        manC.run();
                        break;
                    default:
                        System.out.println("User do not exist! \nExiting system");
                        System.exit(0);
                }
            }
        }
        if(userType== -1) System.out.println("wrong user");

    }


    public void run() {
        authUser();
    }
}
