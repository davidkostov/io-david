package com.clouway.input_output;

import java.io.*;
import java.nio.file.Path;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class CustomFileWriter {

    /**
     * Replaces the contents of a given file with
     * the contents provided as a parameter in reverse order
     *
     * @param contents provided contents to replace old ones
     * @param newFilePath the path for the new file
     */
    public boolean writeInReverseFile(String contents, Path newFilePath) throws IOException {

        File newFile = new File("dummy");
        String[] lines = contents.split(System.getProperty("line.separator"));

        PrintWriter writer =
                new PrintWriter(new BufferedWriter(
                        new FileWriter(newFile, true)));

        for (int index = 0; index < lines.length; index ++) {

            String[] reverser = lines[index].split("");
            String x = "";
            for (int i = 0, j = reverser.length - 1;
                i <= (reverser.length - 1) / 2
                && j >= reverser.length / 2;
                i++, j--) {

                x = reverser[i];
                reverser[i] = reverser[j];
                reverser[j] = x;

            }
            lines[index] = "";
            for (int i = 0; i < reverser.length; i++) {
                lines[index] += reverser[i];
            }

            writer.println(lines[index]);

        }
        writer.close();

        boolean success = newFile.renameTo(newFilePath.toFile());
        if (success) {
            return true;
        }
        else {
            return false;
        }

    }

}
