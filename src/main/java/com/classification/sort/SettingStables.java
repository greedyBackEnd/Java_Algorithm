package com.classification.sort;

import java.util.*;

public class SettingStables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, c, arr));
    }

    private static int solution(int n, int c, int[] arr) {
        int answer = 0;
        int[] tmpArr = new int[n];
        for (int i = 0; i < n; i++) {
            tmpArr[i] = arr[i];
        }
        Arrays.sort(tmpArr);

        int start = 1;
        int end = tmpArr[n - 1] - tmpArr[0];
        while (end >= start) {
            int mid = (start + end) / 2;
            if (count(tmpArr, mid) >= c) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }

    private static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
