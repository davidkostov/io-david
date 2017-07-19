package com.clouway.input_output;

import java.io.*;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class DataClass{
    /**
     * Saves the provided object "o" in the output stream.
     *
     * @param out the output stream to write the object
     * @param objectToSerialize the object to be serialized
     */
    public void saveObject (ObjectOutputStream out, Object objectToSerialize) throws IOException {

        try {
            out.writeObject(objectToSerialize);
        }
        finally {
            out.close();
        }

    }

    /**
     * Reads an object from the provided InputStreams and returns it as result
     *
     * @param in the input stream to read the object
     * @return the object that was read form the stream
     */
    public Object getObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

        Object readObj = null;
        readObj = in.readObject();
        return readObj;

    }
}