package com.clouway.input_output;


import java.io.*;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class DataClassApp {
    public static void main(String[] args) {

        Cat newCat = new Cat("Richie","Persian",5,10,"David");
        System.out.println("Object to be saved:\n"+newCat);

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("src/test/SavedObj.ser"));
             ObjectInputStream in = new ObjectInputStream(
                     new FileInputStream("src/test/SavedObj.ser"))
        ){

            DataClass dataHandler = new DataClass();
            dataHandler.saveObject(out,newCat);
            newCat = (Cat) dataHandler.getObject(in);
            System.out.println("Object loaded:\n"+newCat);

        }
        catch (IOException ioe) {
            System.out.println("An exception occured during data handling..\n"+ioe);
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("The class specified was not found!");
        }

    }

}
