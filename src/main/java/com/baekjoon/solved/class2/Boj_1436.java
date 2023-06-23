package com.baekjoon.solved.class2;

import java.util.Scanner;

public class Boj_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num = 0;
        int count = 0;

        while (count != n) {
            if (String.valueOf(++num).contains("666"))
                count++;
        }
        System.out.println(num);
    }
}
