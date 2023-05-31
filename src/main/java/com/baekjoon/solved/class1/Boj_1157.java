package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next().toUpperCase();
        sc.close();

        int[] alphabetCount = new int[26];

        for (char ch : inputStr.toCharArray()) {
            int idx = ch - 'A';
            alphabetCount[idx]++;
        }

        int maxCount = 0;
        int maxIndex = -1;

        for (int i = 0; i < alphabetCount.length; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                maxIndex = i;
            } else if (alphabetCount[i] == maxCount) {
                maxIndex = -1;
            }
        }

        if (maxIndex == -1)
            System.out.println("?");
        else {
            char res = (char) (maxIndex + 'A');
            System.out.println(res);
        }
    }
}
