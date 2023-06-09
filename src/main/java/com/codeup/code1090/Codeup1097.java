package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] queries = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                queries[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            reverse(queries, x, y);
        }

        for (int[] query : queries) {
            for (int res : query)
                System.out.print(res + " ");
            System.out.println();
        }
        sc.close();
    }

    public static void reverse(int[][] arr, int x, int y) {
        for (int i = 0; i < 19; i++) {
            arr[x][i] = arr[x][i] == 1 ? 0 : 1;
            arr[i][y] = arr[i][y] == 1 ? 0 : 1;
        }
    }
}
