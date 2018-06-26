package com.codecool.ccms;

import java.util.Scanner;

public class Utility {
    public Utility(){

    }
    public String getUserInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
