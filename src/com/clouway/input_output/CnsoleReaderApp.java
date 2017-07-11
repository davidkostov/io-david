package com.clouway.input_output;

import java.io.IOException;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class CnsoleReaderApp {

    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReader();

        try {
            System.out.println(reader.readChar() + " - is a char");
            System.out.println(reader.readString() + " - is a string");
            System.out.println(reader.readInt() + " - is an integer");
            System.out.println(reader.readFloat() + " - is a float");
        }
        catch(InputFormatException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }

}
