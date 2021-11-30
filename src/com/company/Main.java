package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        for (int count = 2; count < arr.length; count++){
            arr[count] = arr[count - 1] + arr[count - 2];
            System.out.println(arr[count]);}
//          Exersize 2
        System.out.println();
        int [] array1 = {1, 5, 3, 16, 2, 20};
        Arrays.sort(array1);
        int sum = array1[0] + array1[array1.length-1];
        System.out.println(sum);
//            Exersize 3
        System.out.println();
        int sum1 = 0;
        int [] arr2 = {2, 8, 12, 11, 24, 3, 6, 16, 83, 14};
        for (int count1 = 0; count1 < arr2.length; count1++){
            if (count1 %2 == 0){
                sum1 = sum1 + arr2[count1];
            }
        }

        int sum2 = 0;
        for (int count2 = 0; count2 < arr2.length;count2++){
            if (count2 %2 !=0){
                sum2 = sum2 + arr2[count2];

            }
        }
        int result = sum1 - sum2;
        System.out.println(result);
    }
}
