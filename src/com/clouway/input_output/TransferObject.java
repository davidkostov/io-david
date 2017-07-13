package com.clouway.input_output;

import java.io.*;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class TransferObject{

    /**
     * Transfers a "size" amount of bytes from a file to another
     * file. It is possible to specify an offset from which to
     * engage the transferring process.
     *
     * @param in the input stream for the original file
     * @param out the output stream for the new file
     * @param offset the offset from which we start the transfer
     * @param size the amount of bytes that we have to transfer
     * @throws IOException
     */
    public int transfer
            (InputStream in, OutputStream out, int offset, int size)
            throws IOException
    {

        in.skip(offset);
        final int bufferSize = 4084;
        byte[] bytes = new byte[bufferSize];
        int bytesTransferred = 0;

        if(size > bufferSize){
            for(int i = size / bufferSize; i>0; i--){
                bytesTransferred += in.read(bytes, 0, bufferSize);
                out.write(bytes);
                size -= bufferSize;
            }
        }

        in.read(bytes, 0, size);
        out.write(bytes, 0, size);

        return bytesTransferred+size;

    }

}
