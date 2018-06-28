package com.codecool.ccms;

import java.util.*;
import java.io.*;

public class DataBase {


    public List<String> readDataFromFile(String fileName) {
        List<String> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e1) {
            System.out.println("No matching file.");
        }
        return data;
    } 

}