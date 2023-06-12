package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String inputStr = sc.next();
        sc.close();
        int sumVal = 0;

        for (int i = 0; i < n; i++) {
            sumVal += Integer.parseInt(String.valueOf(inputStr.charAt(i)));
        }
        System.out.println(sumVal);
    }
}
