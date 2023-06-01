package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(Math.max(reverse(a), reverse(b)));
    }

    private static int reverse(int i) {
        int res = 0;
        while (i > 10) {
            res += i % 10;
            res *= 10;
            i /= 10;
        }
        res += i % 10;
        return res;
    }
}
