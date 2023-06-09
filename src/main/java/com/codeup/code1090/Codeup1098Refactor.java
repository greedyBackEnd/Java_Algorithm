package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1098Refactor {
    private int[][] queries;

    public Codeup1098Refactor(int[][] queries) {
        this.queries = queries;
    }

    public Codeup1098Refactor() {
        this.queries = new int[5][5];
    }
    public Codeup1098Refactor(int rowCnt) {
        this.queries = new int[rowCnt][5];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeX = sc.nextInt();
        int sizeY = sc.nextInt();
        Codeup1098Refactor cu = new Codeup1098Refactor(new int[sizeX][sizeY]);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            play(sc, cu.queries);
        }
        printQueries(cu.queries);
        sc.close();
    }

    private static void printQueries(int[][] queries) {
        for (int[] query : queries) {
            for (int res : query)
                System.out.print(res + " ");
            System.out.println();
        }
    }

    private static void play(Scanner sc, int[][] queries) {
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
}
