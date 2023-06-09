package com.codeup.code1050;

import java.util.Scanner;

public class Codeup1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        if (iVal1 == 1 || iVal2 == 1)
            System.out.println(1);
        else
            System.out.println(0);
        sc.close();
    }
}
