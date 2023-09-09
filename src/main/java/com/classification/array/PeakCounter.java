package com.classification.array;

import java.util.Scanner;

public class PeakCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 2;
        int[][] arr = new int[n][n];
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.print(solution(arr, n));
    }

    public static int solution(int[][] arr, int n) {
        int answer = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int tmp = arr[i][j];
                if (arr[i - 1][j] < tmp
                        && arr[i][j - 1] < tmp
                        && arr[i][j + 1] < tmp
                        && arr[i + 1][j] < tmp) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
