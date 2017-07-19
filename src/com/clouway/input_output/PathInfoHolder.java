package com.clouway.input_output;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class PathInfoHolder {

    private String name, type;

    public PathInfoHolder(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString(){
        return type+": "+name;
    }

}
