package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumb = 0;

        for (int i = 0; i < 5; i++) {
            sumNumb += Math.pow(sc.nextInt(), 2);
        }
        sc.close();

        System.out.println(sumNumb % 10);
    }
}
