package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxVal = 0;
        int maxIdx = 0;

        for (int i = 0; i < 9; i++) {
            int inputVal = sc.nextInt();
            if (inputVal > maxVal) {
                maxVal = inputVal;
                maxIdx = i + 1;
            }
        }
        sc.close();

        System.out.println(maxVal);
        System.out.println(maxIdx);
    }
}
