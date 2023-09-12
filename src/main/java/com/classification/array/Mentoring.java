package com.classification.array;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.print(solution(arr, n, m));
    }

    public static int solution(int[][] arr, int n, int m) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int numbStudent = i;
            boolean[] canMenteeArr = new boolean[n + 1];
            for (int j = 1; j < n + 1; j++) {
                canMenteeArr[j] = true;
            }

            for (int j = m - 1; j >= 0; j--) {
                for (int k = n - 1; k >= 0; k--) {
                    if (arr[j][k] == numbStudent) {
                        break;
                    } else {
                        canMenteeArr[arr[j][k]] = false;
                    }
                }
            }
            for (int j = 1; j <= n; j++) {
                if (canMenteeArr[j] && j != numbStudent) answer++;
            }
        }

        return answer;
    }
}
