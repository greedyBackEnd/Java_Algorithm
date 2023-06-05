package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d\n", a + b);
        System.out.printf("%d\n", a - b);
        System.out.printf("%d\n", a * b);
        System.out.printf("%d\n", a / b);
        System.out.printf("%d\n", a % b);
        sc.close();
    }
}
