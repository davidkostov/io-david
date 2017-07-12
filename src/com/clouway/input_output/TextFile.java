package com.clouway.input_output;

import javax.xml.soap.Text;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class TextFile {

    private Path filePath;

    public TextFile(Path filePath){
        this.filePath = filePath;
    }

    public TextFile reverseAs(Path newFilePath)throws IOException{

        CustomFileWriter writer = new CustomFileWriter();
        CustomFileReader reader = new CustomFileReader();

        String fileContents = reader.readFileContents(filePath.toFile());

        if(writer.writeInReverseFile(fileContents,newFilePath)){
            System.out.println("Reversion is complete!");
            filePath = newFilePath;
            return this;
        }
        else{
            System.out.println("Reversion did not complete!");
            return this;
        }

    }

    public String contentAsString() throws IOException{

        CustomFileReader reader = new CustomFileReader();

        String fileContents = reader.readFileContents(filePath.toFile());

        return fileContents;

    }

}
