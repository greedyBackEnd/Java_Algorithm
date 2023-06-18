package com.baekjoon.solved.class2;

import java.util.Scanner;

public class Boj_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] inputMap = new char[n][m];
        for (int i = 0; i < n; i++) {
            String inputLine = sc.next();
            for (int j = 0; j < m; j++) {
                inputMap[i][j] = inputLine.charAt(j);
            }
        }
        sc.close();

        int minCount = 64;

        // 8 X 8 map 만들기
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int countVal = getCount(inputMap, i, j);
                minCount = Math.min(countVal, minCount);
            }
        }
        System.out.println(minCount);
    }

    private static int getCount(char[][] inputMap, int i, int j) {
        int countVal = 0;
        //n
        for (int k = i; k < i + 8; k++) {
            //m
            for (int l = j; l < j + 8; l++) {
                if ((k+l) % 2 == 0) {
                    if (inputMap[k][l] != inputMap[i][j])
                        countVal++;
                } else {
                    if (inputMap[k][l] == inputMap[i][j])
                        countVal++;
                }
            }
        }
        // 반대의 경우
        countVal = Math.min(countVal, 64 - countVal);
        return countVal;
    }
}
