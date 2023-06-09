package com.codeup.etc;

import java.util.Arrays;

public class QuerySequences {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/181924
     */
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        int[] res = solution(arr, queries);

        System.out.println(Arrays.toString(res));

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        for (int[] query : queries) {
            int tmp = answer[query[0]];
            answer[query[0]] = answer[query[1]];
            answer[query[1]] = tmp;
        }

        return answer;
    }
}
