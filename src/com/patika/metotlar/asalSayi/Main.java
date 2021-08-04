package com.patika.metotlar.asalSayi;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number, int i) {
        if (number < 2) {
            return true;
        }
        if (i == (number / 2)) {
            return true;
        } else if (number % i == 0) {
            return false;
        } else {
            return isPrime(number, i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(
                isPrime(number, 2) == true ? number + " is a prime number" : number + " is not a prime number");
    }
}
