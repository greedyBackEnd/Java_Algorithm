package com.codeup.code1070;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int sumRes = 0;
        for (int i = 0; i <= iVal; i++) {
            if (i % 2 == 0)
                sumRes += i;
        }
        System.out.println(sumRes);
        sc.close();
    }
}
