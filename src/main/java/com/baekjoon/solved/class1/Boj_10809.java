package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] inputArr = sc.next().toCharArray();
        sc.close();

        int[] alphabetArr = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabetArr[i] = -1;
        }

        for (int i = 0; i < inputArr.length; i++) {
            if (alphabetArr[inputArr[i] - 97] == -1)
                alphabetArr[inputArr[i] - 97] = i;
        }

        for (int res : alphabetArr)
            System.out.printf("%d ", res);
    }
}
