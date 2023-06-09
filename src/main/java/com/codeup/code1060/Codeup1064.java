package com.codeup.code1060;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();
        int min = (iVal1 < iVal2 ? iVal1 : iVal2) < iVal3 ? (iVal1 < iVal2 ? iVal1 : iVal2) : iVal3;
        System.out.println(min);
        sc.close();
    }
}
