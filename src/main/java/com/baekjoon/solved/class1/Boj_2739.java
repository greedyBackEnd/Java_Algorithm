package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d", n, i, n * i);
            System.out.println();
        }

        sc.close();
    }
}
