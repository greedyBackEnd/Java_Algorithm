package com.codeup.code1120;

import java.util.Scanner;

public class Codeup1121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        System.out.printf("%d\n", inputA % inputB);
        sc.close();
    }
}
