package com.clouway.input_output;

import java.io.*;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class CustomFileReader {

    /**
     * Reads the contents of a file and passes them
     *
     * @param fileToRead the file to be read
     * @return the contents of the file
     */
    public String readFileContents(File fileToRead) throws IOException {

        StringBuilder strBuilder = new StringBuilder();
        String contentHolder = "";

        BufferedReader reader =
                     new BufferedReader(new FileReader(fileToRead));

        contentHolder = reader.readLine();
        while (contentHolder != null) {

            strBuilder.append(contentHolder + "\n");
            contentHolder = reader.readLine();

        }

        reader.close();
        return strBuilder.toString();

    }

}