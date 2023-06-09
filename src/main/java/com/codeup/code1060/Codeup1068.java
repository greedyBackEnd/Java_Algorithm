package com.codeup.code1060;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        if (iVal >= 90)
            System.out.println("A");
        else if (iVal >= 70)
            System.out.println("B");
        else if (iVal >= 40)
            System.out.println("C");
        else
            System.out.println("D");
        sc.close();
    }
}
