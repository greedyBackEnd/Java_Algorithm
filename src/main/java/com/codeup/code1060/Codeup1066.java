package com.codeup.code1060;

import java.util.Scanner;

public class Codeup1066 {

    private static boolean isEven(int i) {
        return (i % 2 == 0);
    }

    private static void printEvenOrOdd(Boolean b) {
        if (b)
            System.out.println("even");
        else
            System.out.println("odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            printEvenOrOdd(isEven(sc.nextInt()));
        }
        sc.close();
    }
}
