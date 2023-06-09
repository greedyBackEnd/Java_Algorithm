package com.codeup.code1120;

import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        int inputC = sc.nextInt();
        System.out.printf("%.2f\n", ((float) inputA + inputB + inputC) / 3);
        sc.close();
    }
}
