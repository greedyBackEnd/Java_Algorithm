package com.classification.sort;

import java.util.*;

public class InsertionSort {
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

        for (int i = 1; i < n; i++) {
            int tmp = answer[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (answer[j] > tmp) {
                    answer[j + 1] = answer[j];
                } else break;
            }
            answer[j + 1] = tmp;
        }
        return answer;
    }
}
