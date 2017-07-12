package com.clouway.input_output;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class FileContentReverserApp {

    public static void main(String[] args) {

        Path filePath = Paths.get("src/test/FileToReverse");
        Path reversedFilePath = Paths.get("src/test/ReversedFile");

        try {
            TextFile reversedFile =
                    new TextFile(filePath).reverseAs(reversedFilePath);
            System.out.println(reversedFile.contentAsString());
        }
        catch (IOException ioe) {
            System.out.println("Oops, something went wrong...\n");
            ioe.printStackTrace();
        }

    }

}
