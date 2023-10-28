package com.company;


public class Controller {
    public static void action(){
        Input input = new Input();
        String show = input.consoleInput();

        Parser str = new Parser();
        String[] data = str.parser(show);
        str.createFile(data);


        //System.out.println("Output: " + show);

    }
}
