package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if (m >= 45) {
            m -= 45;
        } else {
            m += 15;
            if (h >= 1) {
                h -= 1;
            } else {
                h = 23;
            }
        }

        System.out.printf("%d %d", h, m);
    }
}
