package com.company;

import com.company.exceptionsFile.*;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;


public class Parser {
    private String data;
    private String[] str;
    private int amountOfData = 6;
    private int phoneSize = 11;
    private int ordinalNumberDateInArray = 3;
    private int dayMonthYearElements = 3;
    private int ordinalNumberPhoneInArray = 4;
    private int ordinalNumberGenderInArray = 5;
    private String soname;
    private String name;
    private String patronymic;
    private String date;
    private long phone;
    private String gender;


    public String[] parser (String data){
        this.data = data;
        this.str = data.split(" ");

        try {
            if (str.length < amountOfData){
                throw new IncorrectlyEnteredData();
            }
            if (str.length > amountOfData){
                throw new MoreDataEntered();
            }
        } catch (RuntimeException e){
            throw e;
        }

        for (int i = 0; i < str.length; i++) {
            if (i == 0 || i == 1 || i == 2){
                try {
                    String.valueOf(str[i]);

                     soname = str[0];
                }catch (Exception e){
                    throw e;
                }
            }

            if (i == ordinalNumberDateInArray){
                try {
                    String[] temp = str[ordinalNumberDateInArray].split("\\.");
                    if (temp.length != dayMonthYearElements){
                        throw new IncorrectlyEnteredData();
                    }
                    for (int j = 0; j < temp.length; j++) {
                        Integer.parseInt(temp[j]);
                    }
                }catch (NumberFormatException e){
                    System.out.println(str[i]);
                    throw e;
                }
                continue;
            }

            if (i == ordinalNumberPhoneInArray){
                try {
                    if (str[i].length() != phoneSize){
                        throw new PhoneSizeException();
                    }
                    if (str[i].contains("+") || str[i].contains("-")){
                        throw new NumberFormatException("Param 'phone' not valid: " + str[i]);
                    }
                    Long.parseLong(str[i]);
                } catch (NumberFormatException e){
                    throw e;
                }
                continue;
            }
            if (i == ordinalNumberGenderInArray){
                try {
                    if (str[i].equals("f") || str[i].equals("m")){
                        // По требованиям передаём f и m
                    } else {
                        throw new GenderException();
                    }
                } catch (NumberFormatException e){
                    throw e;
                }
                continue;
            }
        }
        //System.out.println(Arrays.toString(str));
    return str;
    }


    public void createFile(String[] array){
        try {
            soname = array[0];
            File file = new File(soname + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]).append(" ");
                if (i == array.length-1){
                    sb.append("\n");
                }
            }
            Files.write(file.toPath(), sb.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}


