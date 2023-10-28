package com.classification.sort;

import java.util.*;

public class CheckDuplicationByBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, arr));
    }

    public static char solution(int n, int[] arr) {
        char answer = 'U';
        int[] tmpArr = new int[n];

        for (int i = 0; i < n; i++) {
            tmpArr[i] = arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tmpArr[j] == tmpArr[j+1]) return 'D';

                if (tmpArr[j] > tmpArr[j + 1]) {
                    int tmp = tmpArr[j];
                    tmpArr[j] = tmpArr[j + 1];
                    tmpArr[j+1] = tmp;
                }
            }
        }

        return answer;
    }
}
