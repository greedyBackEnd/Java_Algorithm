package com.codeup.etc;

import java.util.Arrays;

public class Queries {
    public static void main(String[] args) {
        int n =3;
        int[][] queries = solution(n);
        for (int[] query: queries) {
            System.out.println(Arrays.toString(query));
        }
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                    answer[i][j] = 1;
            }
        }
        return answer;
    }
}
