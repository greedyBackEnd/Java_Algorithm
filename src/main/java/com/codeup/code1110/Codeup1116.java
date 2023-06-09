package com.codeup.code1110;

import java.util.Scanner;

public class Codeup1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        System.out.printf("%d+%d=%d\n", inputA, inputB, inputA + inputB);
        System.out.printf("%d-%d=%d\n", inputA, inputB, inputA - inputB);
        System.out.printf("%d*%d=%d\n", inputA, inputB, inputA * inputB);
        System.out.printf("%d/%d=%d\n", inputA, inputB, inputA / inputB);

        sc.close();
    }
}
