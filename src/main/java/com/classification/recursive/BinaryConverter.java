package com.classification.recursive;

import java.util.*;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        DFS(n);
    }

    private static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }
}
