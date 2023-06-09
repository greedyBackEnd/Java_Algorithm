package com.codeup.code1020;

import java.util.Scanner;

public class Codeup1025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int[] digits = new int[5];
        int tmp = 10000;

        for (int i = 0; i < 5; i++) {
            digits[i] = (iVal / tmp) * tmp;
            iVal %= tmp;
            tmp /= 10;
        }
        for (int digit : digits)
            System.out.printf("[%d]\n", digit);
        sc.close();
    }
}
