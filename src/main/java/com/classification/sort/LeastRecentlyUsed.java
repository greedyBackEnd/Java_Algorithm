package com.classification.sort;

import java.util.*;

public class LeastRecentlyUsed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i : solution(s, n, arr))
            System.out.print(i + " ");
    }

    public static int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (x == answer[i]) {
                    pos = i;
                    break;
                }
            }

            if (pos != -1) {
                for (int i = pos; i > 0; i--) {
                    answer[i] = answer[i - 1];
                }
            } else {
                for (int i = s - 1; i > 0; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            answer[0] = x;
        }

        return answer;
    }
}
