package com.patika.diziler.pratik;

public class Ortalama {

    public static double calculateAverage(int[] arr) {
        double total = 0;
        int count = arr.length;

        for (int i : arr) {
            total += i;    
        }

        return total / count;
    }

    public static void main(String[] args) {
        int[] list = {15, 6, 7, 12, 7, 9, 3};
        System.out.println(calculateAverage(list));
    }
}
