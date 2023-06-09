package com.codeup.code1040;

import java.util.Scanner;

public class Codeup1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long lVal1 = sc.nextLong();
        long lVal2 = sc.nextLong();
        System.out.printf("%d", lVal1 << lVal2);
        sc.close();
    }
}
