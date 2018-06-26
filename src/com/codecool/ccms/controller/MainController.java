package com.codecool.ccms.controller;

import com.codecool.ccms.view.MainView;

import java.util.ArrayList;

public class MainController {
    private static final MainView mainView = new MainView();

    public MainController(){

    }
    public void authUser(){
        ArrayList<String> data = mainView.getAuthData();
    }
}
