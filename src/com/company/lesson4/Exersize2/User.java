package com.company.lesson4.Exersize2;

public class User {

    private String name;
    private String secondName;
    private int age;
    private String country;
    private String city;


    public User (String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public User(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;

    }

    public User(String name, String secondName, int age, String country, String city) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.country = country;
        this.city = city;
    }

    public String GetName (){
        return name + " " + secondName;
    }

    public void GetNameAge (){
        System.out.println(name + " " + secondName + "" + " " + age);

    }

    public String GetNameAgeSex(){
        return name + " " + secondName + "" + " " + age + " " + Sex.male;
    }

    public int IncreaseAge (){
        return age+1;
    }

    public String GetFullInfo(){
        return this.GetNameAgeSex() + " " + country + " " + city;
    }
}
