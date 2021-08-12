package com.patika.diziler.odev;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");

        int size = input.nextInt();
        int count = 0;
        int[] arr = new int[size];

        System.out.println("Dizinin elemanlarını giriniz : ");
        while (true) {

            System.out.print(count + 1 + ". Elemanı : ");
            int number = input.nextInt();

            arr[count] = number;

            count++;
            size--;

            if (size == 0){
                break;
            }
        }
        Arrays.sort(arr);
        System.out.println("Sıralama: " + Arrays.toString(arr));

    }
}


