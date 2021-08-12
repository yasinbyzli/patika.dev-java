package com.patika.diziler.odev;

import java.util.Scanner;

public class CloseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int[] arr = { 15, 12, 788, 1, -1, -778, 2, 0 };

        int max = arr[0];
        int min = arr[0];

        int maxC = 0;
        int minC = 0;

        for (int i : arr) {
            if (i < number) {
                if (minC == 0) {
                    minC = number - i;
                    min = i;
                } else if (number - i < minC) {
                    minC = number - i;
                    min = i;
                }
            } else if (number < i){
                
                if (maxC == 0)
                {
                    maxC = i - number;
                    max = i;
                }
                else if (i - number < maxC)
                {
                    maxC = i - number;
                    max = i;
                }
            }
        }

        System.out.println("Girilen Sayı: " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);

    }
}
