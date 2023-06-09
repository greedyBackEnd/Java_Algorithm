package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeX = sc.nextInt();
        int sizeY = sc.nextInt();
        int[][] queries = new int[sizeX][sizeY];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt(); // 길이 방향 x y
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (d == 0) {
                for (int j = y; j < y + l; j++) {
                    queries[x][j] = 1;
                }
            } else {
                for (int k = x; k < x + l; k++) {
                    queries[k][y] = 1;
                }
            }
        }
        for (int[] query : queries) {
            for (int res : query)
                System.out.print(res + " ");
            System.out.println();
        }
        sc.close();
    }
}
