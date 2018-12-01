package com.lits;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {

             char input;
             String SayHi = "Hi, my name is ";
             String SayNiceToMeetYou = "Nice to meet you!";
        try (InputStreamReader cin = new InputStreamReader(System.in);
             FileOutputStream out = new FileOutputStream("src/main/resources/outputB")){
            out.write(SayHi.getBytes());
            System.out.println("Write your name: ");
            do{
                input = (char) cin.read();
                out.write(input);
            }while (input != '\n' );
            out.write(SayNiceToMeetYou.getBytes());

        }

    }

}
