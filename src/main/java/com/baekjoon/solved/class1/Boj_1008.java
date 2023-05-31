package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        double res = (double) a / b;
        System.out.println(res);
    }
}
