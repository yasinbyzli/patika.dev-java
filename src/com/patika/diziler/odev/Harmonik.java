package com.patika.diziler.odev;

public class Harmonik {

    public static double calculateHarmonik(int[] arr){
        int count = arr.length;
        double total = 0;

        for (int i : arr) {
            total += 1.0 / i;
        }

        return count / total;
    }

    public static void main(String[] args) {

        int array[] = {1,2,3,4,5};
        System.out.println(calculateHarmonik(array));
        

    }
}
