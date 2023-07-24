package com.classification.array;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2; j <= n / i; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        for (boolean b : isPrime) {
            if (b) answer++;
        }
        return answer;
    }
}
