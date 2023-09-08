package com.classification.array;

import java.util.Scanner;

public class RankCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] result = solution(arr, n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
