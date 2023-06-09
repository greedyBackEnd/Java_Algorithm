package com.codeup.code1040;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long lVal1 = sc.nextLong();
        long lVal2 = sc.nextLong();
        long lVal3 = sc.nextLong();
        long sumRes = lVal1 + lVal2 + lVal3;
        float avgRes = ((float) sumRes) / 3;
        System.out.printf("%d\n", sumRes);
        System.out.printf("%.1f", avgRes);
        sc.close();
    }
}
