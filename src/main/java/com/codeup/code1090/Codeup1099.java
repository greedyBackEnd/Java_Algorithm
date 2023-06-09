package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] queries = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                queries[i][j] = sc.nextInt();
            }
        }
        int x = 1;
        int y = 1;
        while (queries[x][y] != 2) {
            queries[x][y] = 9;
            if (queries[x][y + 1] != 1) {
                y++;
            } else if (queries[x + 1][y] != 1) {
                x++;
            } else if (queries[x][y + 1] == 1 && queries[x + 1][y] == 1) {
                break;
            }
        }
        queries[x][y] = 9;

        for (int[] query : queries) {
            for (int res : query) {
                System.out.print(res + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
