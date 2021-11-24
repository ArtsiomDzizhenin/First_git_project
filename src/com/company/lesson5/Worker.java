package com.company.lesson5;

public class Worker extends Employee {

    public Worker(String name, String secondName, int experience, PROFESSION profession) {
        super(name, secondName, experience, profession);
    }

    @Override
    public PROFESSION SetPosition(){
        PROFESSION worker = PROFESSION.WORKER;
        return worker;
    }


}
