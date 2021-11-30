package com.company.lesson4.Exersize2;

public class Main {
    public static void main(String[] args) {
        User user = new User("Artsiom", "Dzizhenin");
        System.out.println(user.GetName());
        User user1 = new User("Artsiom", "Dzizhenin", 30);
        user1.GetNameAge();
        user1.GetNameAgeSex();
        System.out.println(user1.GetName() + " " + user1.IncreaseAge());
        User user2 = new User("Dmitriy", "Dzizhenin", 37);
        System.out.println(user2.GetNameAgeSex());
        User user3 = new User("Maksim","Glad", 29,"Belarus", "Mogilev");
        System.out.println(user3.GetFullInfo());


    }
}
