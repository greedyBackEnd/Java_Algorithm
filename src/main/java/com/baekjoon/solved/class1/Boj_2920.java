package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArr = new int[8];

        for (int i = 0; i < 8; i++) {
            inputArr[i] = sc.nextInt();
        }
        sc.close();

        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < 7; i++) {
            if (inputArr[i] < inputArr[i+1]){
                desc = false;
            } else if (inputArr[i] > inputArr[i + 1]) {
                asc = false;
            }
        }

        if (asc)
            System.out.println("ascending");
        else if (desc)
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
