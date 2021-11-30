package com.company.lesson4.Exersize1;

public enum MONTH {
    january,
    february,
    march,
    april,
    may,
    june,
    july,
    august,
    september,
    october,
    november,
    december;

    public static String[] names(){
        MONTH[] months = values();
        String[] names = new String[months.length];
        for (int i = 0; i < months.length; i++) {
            names[i] = months[i].name();
        }
        return names;
    }




}










