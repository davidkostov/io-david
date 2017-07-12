package com.clouway.input_output;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class FileMakerApp {

    public static void main(String[] args) {

        String fileName = "";
        Scanner scanner = new Scanner(System.in);
        fileName = scanner.nextLine();

        InputReader reader = new InputReader();
        FileMaker maker = new FileMaker();
        try {
            maker.makeFile(fileName, reader.readTillReach("."));
        }
        catch(IOException ioe){
            System.out.println("A problem occured while creating the file: "+ioe);
        }
    }

}