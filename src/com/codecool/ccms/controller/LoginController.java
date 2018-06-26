package com.codecool.ccms.controller;

import com.codecool.ccms.view.LoginView;

import java.util.ArrayList;

public class LoginController {
    private static final LoginView LOGIN_VIEW = new LoginView();
    // private static final DataManager dm = new DataManager();

    public LoginController(){

    }
    public void printMenu(ArrayList<String> data){

    }
    public void authUser(){
        //data manager instance

        ArrayList<String> data = LOGIN_VIEW.getAuthData();
        //searching for equivalent user mail in file/database
        //if authed then run proper Controller
    }

    public void run(){
        authUser();
        StudentController sc = new StudentController();
        sc.run();
    }
}
