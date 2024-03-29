package com.classification.recursive;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(DFS(n));
    }

    private static int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n - 1);
    }
}
