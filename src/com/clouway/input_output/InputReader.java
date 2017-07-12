package com.clouway.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class InputReader {

    private String contents;

    public InputReader(){
        contents = "";
    }

    /**
     * Reads input from the console until a "." is entered
     * and saves it.
     */
    public String readTillReach(String terminatePattern)throws IOException{

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        try {

            String currentInput = "";

            while (!currentInput.equals(terminatePattern)) {

                currentInput = reader.readLine();
                if (!currentInput.equals(terminatePattern)) {
                    contents += currentInput;
                }

            }

            return contents;
        }
        finally {
            reader.close();
        }

    }

}
