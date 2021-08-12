package com.patika.diziler.pratik;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] list = {15, 6, 7, 12, 7, 9, 3};

        /* 
        ? 1. Yol
        int min = list[0];
        int max = list[1];

        for (int i : list) {
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }

        System.out.println("Dizinin en küçük sayısı: " + min);
        System.out.println("Dizinin en büyük sayısı: " + max);
        */

        /*
        ? 2. Yol
        Arrays.sort(list);
        
        System.out.println("Dizinin en küçük sayısı: " + list[0]);
        System.out.println("Dizinin en büyük sayısı: " + list[list.length - 1]);
        */
    }
}
