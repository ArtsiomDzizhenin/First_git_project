package com.company.lesson5;

public class Person {

    protected String name;
    protected String secondName;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String GetFullName (){
        return name + " " + secondName;
    }
}
