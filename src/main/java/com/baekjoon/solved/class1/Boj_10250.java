package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int floor = n % h != 0 ? n % h : h;
            int roomNum = n % h != 0 ? n / h + 1: n / h;

            System.out.println(floor*100 + roomNum);
        }
        sc.close();
    }
}
