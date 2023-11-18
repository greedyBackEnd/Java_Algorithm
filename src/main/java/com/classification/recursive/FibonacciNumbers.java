package com.classification.recursive;

import java.util.*;

public class FibonacciNumbers {
    static int[] numbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        numbers = new int[n + 1];
        DFS(n);
        for (int i = 1; i <= n; i++) System.out.print(numbers[i] + " ");
    }

    private static int DFS(int n) {
        if (numbers[n] > 0) return numbers[n];
        if (n == 1 || n == 2) return numbers[n] = 1;
        else return numbers[n] = DFS(n - 2) + DFS(n - 1);
    }
}
