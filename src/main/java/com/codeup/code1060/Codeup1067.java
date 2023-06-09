package com.codeup.code1060;

import java.util.Scanner;

public class Codeup1067 {

    private static boolean isEven(int i) {
        return (i % 2 == 0);
    }

    private static boolean isPlus(int i) {
        return (i > 0);
    }

    private static void printEvenOrOdd(Boolean b) {
        if (b)
            System.out.println("even");
        else
            System.out.println("odd");
    }

    private static void printPlusOrMinus(Boolean b) {
        if (b)
            System.out.println("plus");
        else
            System.out.println("minus");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        printPlusOrMinus(isPlus(iVal));
        printEvenOrOdd(isEven(iVal));
        sc.close();
    }
}
