package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int[] arr = new int[10];
        int multiVal = a * b * c;

        while (multiVal > 0) {
            arr[multiVal%10]++;
            multiVal /= 10;
        }

        for (int i : arr)
            System.out.println(i);
    }
}
