package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        float maxScore = 0;
        float sumScore = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxScore)
                maxScore = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxScore * 100;
            sumScore += arr[i];
        }

        System.out.println(sumScore / n);
    }
}
