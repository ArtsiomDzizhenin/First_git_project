package com.company.lesson5;

import java.util.Arrays;

public class Director extends Employee{

    public Director(String name, String secondName, int experience, PROFESSION profession) {
        super(name, secondName, experience, profession);
    }

    @Override
    public PROFESSION SetPosition(){
        PROFESSION director = PROFESSION.DIRECTOR;
        return director;
    }

    public String[] addWorker(Employee employee){
        String[] workers = null;
        String[] workers1 = Arrays.copyOf(workers, workers.length + 1);
        return workers1;

    }

    @Override
    public int SetSalary() {
        int BaseSalary = SetSalary();
        return BaseSalary * addWorker().length;
    }
}
