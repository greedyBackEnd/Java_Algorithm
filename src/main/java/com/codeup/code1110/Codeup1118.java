package com.codeup.code1110;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        System.out.printf("%.1f\n", (float) inputA * inputB / 2);

        sc.close();
    }
}
