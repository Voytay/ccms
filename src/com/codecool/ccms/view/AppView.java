package com.codecool.ccms.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView extends View{

    public static String getUserInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    //OVERLOAD
    public static int getUserInput() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
            try {
                i = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("It's not a number!");
            }
        return i;
    }


}
