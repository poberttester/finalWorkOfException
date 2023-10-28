package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public String consoleInput() {
        System.out.print("Enter your data: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            return reader.readLine();
        }catch (IOException e){
            System.out.println("Error");
        }
        return null;
   }
}
