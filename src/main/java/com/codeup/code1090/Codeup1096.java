package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] queries = new int[19][19];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            queries[x][y] = 1;
        }
        for (int[] query : queries) {
            for (int res : query)
                System.out.print(res + " ");
            System.out.println();
        }
        sc.close();
    }
}
