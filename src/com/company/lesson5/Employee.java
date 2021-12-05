package com.company.lesson5;

public abstract class Employee extends Person {

    protected int experience;
    protected PROFESSION profession;

    public Employee(String name, String secondName, int experience, PROFESSION profession) {
        super(name, secondName);
        this.experience = experience;
        this.profession = profession;
    }

    public int SetSalary(){
        int BaseSalary = 1000;
        return BaseSalary * profession.koef * experience;
    }

    public abstract PROFESSION SetPosition();


}
