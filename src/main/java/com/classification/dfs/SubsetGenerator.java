package com.classification.dfs;

import java.util.*;

public class SubsetGenerator {

    static int n;
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        ch = new int[n + 1];
        DFS(1);
    }

    private static void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] != 0) tmp += (i + " ");
            }
            System.out.println(tmp);
            return;
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }
}
