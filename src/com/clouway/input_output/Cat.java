package com.clouway.input_output;

import java.io.Serializable;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class Cat implements Serializable {

    private String name, breed, ownerName, weight;
    private int age;

    public Cat(String name, String breed, int age,
               int weightInKilos, String ownerName){

        this.name = name;
        this.breed = breed;
        this.age = age;
        weight = weightInKilos+"kg";
        this.ownerName = ownerName;

    }

    public Cat(String breed, int age, int weightInKilos){

        this.name = "No name";
        this.breed = breed;
        this.age = age;
        weight = weightInKilos+"kg";
        this.ownerName = "No owner";

    }

    public String toString(){
        return "\n--== Current cat ==--\n Name: "+name+
                "\n Breed: "+breed+"\n Age: "+age+
                "\n Weight: "+weight+"\n Owner: "+ownerName+"\n";
    }

}
