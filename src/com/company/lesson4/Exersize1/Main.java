package com.company.lesson4.Exersize1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        String text = scanner.next();
        MONTH month = MONTH.january;
        System.out.println(month.name());
        System.out.println(Arrays.asList(month.name()));

        for (MONTH season : values)  {
                switch (season) {
                    case december:
                        if (text.equals(MONTH.december)){
                        System.out.println("Winter");}
                        break;
                    case january:
                        if (text.equals(MONTH.january)){
                        System.out.println("Winter");}
                        break;
                    case february:
                        if (text.equals(MONTH.february)){
                        System.out.println("Winter");}
                        break;
                    case march:
                        if (text.equals(MONTH.march)){
                        System.out.println("Spring");
                        }
                        break;
                    case april:
                        if (text.equals(MONTH.april)){
                            System.out.println("Spring");
                        }
                        break;
                    case may:
                        if (text.equals(MONTH.may)){
                            System.out.println("Spring");
                        }
                        break;
                    case june:
                        if (text.equals(MONTH.june)){
                            System.out.println("Summer");
                        }
                        break;
                    case july:
                        if (text.equals(MONTH.july)){
                            System.out.println("Summer");
                        }
                        break;
                    case august:
                        if (text.equals(MONTH.august)){
                            System.out.println("Summer");
                        }
                        break;
                    case september:
                        if (text.equals(MONTH.september)){
                            System.out.println("Autumn");
                        }
                        break;
                    case october:
                        if (text.equals(MONTH.october)){
                            System.out.println("Autumn");
                        }
                        break;
                    case november:
                        if (text.equals(MONTH.november)){
                            System.out.println("Autumn");
                        }
                        break;
                    default:
                        System.out.println("Error");
                }
            }


        }


    }


