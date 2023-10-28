package com.company;


public class Controller {
    public static void action(){
        Input input = new Input();
        //String show = input.consoleInput();

        Parser str = new Parser();
        String[] data = str.parser("Romin Dmitriy Maksimovich 12.12.2000 79003100146 m");
        str.createFile(data);


        //System.out.println("Output: " + show);

    }
}
