package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char[] inputVal = sc.next().toCharArray();
            int score = 0;
            int cnt = 0;
            for (char c : inputVal) {
                if (c == 'O')
                    score += ++cnt;
                else
                    cnt = 0;
            }
            System.out.println(score);
        }
        sc.close();
    }
}
