package com.codecool.ccms;

import java.util.*;
import java.io.*;

public class DataBase {

    private Scanner scanner;
    private List<String> data;

    public DataBase(String fileName) {
        this.data = new ArrayList<>();
        
        try {
            readDataFromFile(fileName);

        } catch (FileNotFoundException e1) {
            System.out.println("No matching file.");
        }
    }

    private void readDataFromFile(String fileName) throws FileNotFoundException {
        this.scanner = new Scanner(new File(fileName));
        while (this.scanner.hasNextLine()) {
            data.add(scanner.nextLine());
        }
    } 

    public List<String> getData() {
        return this.data;
    }
}