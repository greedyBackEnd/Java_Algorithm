package com.classification.stack;

import java.util.*;

public class CraneDollGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n + 1; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(solution(n, board, m, moves));
    }

    public static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[j][moves[i]] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][moves[i]]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][moves[i]]);
                    }
                    board[j][moves[i]] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
