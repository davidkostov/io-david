package com.clouway.input_output;

import java.io.*;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class FileMaker {

    /**
     * makes a file with a custom name and custom contents
     */
    public void makeFile(String fileName, String contents)throws IOException{

        FileWriter writer =
                    new FileWriter(fileName+".txt");

        writer.write(contents);

        writer.close();

    }

}
