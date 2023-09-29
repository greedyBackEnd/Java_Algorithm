package com.classification.slidingWindow;

import java.util.Scanner;

public class ConsecutiveSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int tmp = 1;
        for (int i = 2; i < n / 2; i++) {
            tmp += i;
            if (n >= tmp) {
                if ((n - tmp) % i == 0) answer++;
            }
        }
        return answer;
    }
}
