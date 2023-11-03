package com.classification.sort;

import java.util.*;

public class MusicVideo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int[] tmpArr = new int[n];
        for (int i = 0; i < n; i++) {
            tmpArr[i] = arr[i];
        }
        int start = Arrays.stream(tmpArr).max().getAsInt();
        int end = Arrays.stream(tmpArr).sum();
        while (start <= end) {
            int mid = (start + end) / 2;
            if (count(tmpArr, mid) <= m) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }

    private static int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }
}
