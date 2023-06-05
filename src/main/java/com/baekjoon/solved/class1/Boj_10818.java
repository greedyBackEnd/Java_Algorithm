package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minRes = Integer.MAX_VALUE;
        int maxRes = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int inputVal = sc.nextInt();
            if (inputVal > maxRes) maxRes = inputVal;
            if (inputVal < minRes) minRes = inputVal;
        }
        System.out.printf("%d %d", minRes, maxRes);

        sc.close();
    }
}
