package com.clouway.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class ConsoleReader {

    BufferedReader reader;

    public ConsoleReader(){

        reader = new BufferedReader(new InputStreamReader(System.in));

    }

    /**
     * Reads a string from the console
     * @return the string that has been read
     * @throws IOException
     */
    public String readString() throws IOException {

            return reader.readLine();

    }

    /**
     * Reads an integer from the console
     * @return the integer that has been read
     * @throws IOException
     */
    public Integer readInt() throws IOException{

        try {
            return new Integer(reader.readLine());
        }
        catch(NumberFormatException e){
            throw new InputFormatException("What you entered is not an integer!");
        }

    }

    /**
     * Reads a char from the console
     * @return the char that has been read
     * @throws IOException
     */
    public char readChar() throws IOException{

            return reader.readLine().charAt(0);

    }

    /**
     * Reads a floating point number from the console
     * @return the float that has been read
     * @throws IOException
     * @throws NumberFormatException
     */
    public float readFloat() throws IOException{

        try{
            return new Float(reader.readLine());
        }
        catch(NumberFormatException e){
            throw new InputFormatException("What you entered is not a floating point number!");
        }

    }
}
