package com.classification.array;

import java.util.Scanner;

public class TemporaryClassPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.print(solution(arr, n));
    }

    public static int solution(int[][] arr, int n) {
        int answer = 0;
        int max = 0;
        int[] cntArr = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }
        return answer;
    }
}
