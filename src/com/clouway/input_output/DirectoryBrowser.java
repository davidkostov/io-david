package com.clouway.input_output;

import javax.tools.FileObject;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class DirectoryBrowser {

    public List<PathInfoHolder> listContent(String path){

        Path pathHolder = new File(path).toPath();
        List<PathInfoHolder> listOfFiles = new ArrayList<PathInfoHolder>();

        if(Files.exists(pathHolder)){

            if(Files.isDirectory(pathHolder)){
                File[] contents = pathHolder.toFile().listFiles();

                for(File file : contents){
                    if(file.isDirectory()){
                        listOfFiles.add(new PathInfoHolder(
                                file.getName(),"Dir"));
                    }
                    else if(file.isFile()){
                        listOfFiles.add(new PathInfoHolder(
                                file.getName(),"File"));
                    }
                }

                return listOfFiles;

            }
            else if(Files.isRegularFile(pathHolder)){

                listOfFiles.add(new PathInfoHolder(
                        pathHolder.toFile().getName(),"File"));
                return listOfFiles;

            }
        }

        return listOfFiles;

    }

}