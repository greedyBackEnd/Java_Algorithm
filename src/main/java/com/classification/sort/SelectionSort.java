package com.classification.sort;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i : solution(n, arr))
            System.out.print(i + " ");
    }

    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = arr[i];
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (answer[j] < answer[i]) {
                    int tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }
        return answer;
    }
}
