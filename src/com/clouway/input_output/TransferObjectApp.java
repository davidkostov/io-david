package com.clouway.input_output;

import java.io.*;
import java.util.Scanner;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class TransferObjectApp {

    public static void main(String[] args) {

        try(
            FileInputStream reader = new FileInputStream("src/test/FileToTransfer");
            FileOutputStream writer = new FileOutputStream("src/test/Transferred")
        ){
            TransferObject transferor = new TransferObject();
            System.out.println("Number of bytes transfered - "+
                    transferor.transfer(reader, writer, 10, 4100));
        }
        catch(IOException ioe) {
            System.out.println("There was an exception while transfering data...\n"+ioe);
        }

    }

}