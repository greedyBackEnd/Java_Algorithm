package com.codeup.code1040;

import java.util.Scanner;

public class Codeup1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int res = iVal1 / iVal2;
        System.out.printf("%d", res);
        sc.close();
    }
}
