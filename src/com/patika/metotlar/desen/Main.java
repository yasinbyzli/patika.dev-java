package com.patika.metotlar.desen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Integer pattern(int number) {
        int result;
        if (number > 0) {
            number -= 5;
            System.out.println(number);
            return pattern(number);
        } else if (number < 0) {
            result = pattern(number + 5);
            System.out.println(result);
        }
        return number;

    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        pattern(number);
    }
}
