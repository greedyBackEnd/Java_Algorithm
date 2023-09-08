package com.classification.array;

import java.util.Scanner;

public class MaxGridSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.print(solution(arr, n));
    }

    public static int solution(int[][] arr, int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sumX = 0;
            int sumY = 0;
            for (int j = 0; j < n; j++) {
                sumX += arr[i][j];
                sumY += arr[j][i];
            }
            if (answer < sumX) answer = sumX;
            if (answer < sumY) answer = sumY;
        }
        int sumDiagX = 0;
        int sumDiagY = 0;
        for (int i = 0; i < n; i++) {
            sumDiagX += arr[i][i];
            sumDiagY += arr[i][n - i - 1];
        }
        if (answer < sumDiagX) answer = sumDiagX;
        if (answer < sumDiagY) answer = sumDiagY;

        return answer;
    }
}
