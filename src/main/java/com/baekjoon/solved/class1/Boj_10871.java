package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int inputVal = sc.nextInt();
            if (inputVal < x) System.out.printf("%d ", inputVal);
        }

        sc.close();
    }
}
