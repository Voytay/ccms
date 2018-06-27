package com.codecool.ccms;

import com.codecool.ccms.controller.AppController;
import com.codecool.ccms.view.AppView;

public class Main {
private static final AppController APP_CONTROLLER = new AppController();
    public static void main(String[] args) {
    APP_CONTROLLER.run();
    }
}
