package com.codeup.code1060;

import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int max = iVal1 > iVal2 ? iVal1 : iVal2;
        System.out.println(max);
        sc.close();
    }
}
