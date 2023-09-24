package com.classification.slidingWindow;

import java.util.Scanner;

public class MaximumRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = 1; i < n - k + 1; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            if (answer < sum) answer = sum;
        }
        return answer;
    }
}
