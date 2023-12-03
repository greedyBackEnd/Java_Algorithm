package com.classification.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CalvesFinderRetry {
    static int answer = 0;
    static int[] dis = {1, -1, 5};
    static int[] ch;
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(BFS(s, e));
    }

    public static int BFS(int s, int e) {
        ch = new int[10001];
        Q.offer(s);
        ch[s] = 1;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Integer poll = Q.poll();
                for (int j : dis) {
                    int tmp = poll + j;
                    if (tmp == e) return answer + 1;
                    if (ch[tmp] == 0 && tmp >= 1 && tmp <= 10000) {
                        ch[tmp] = 1;
                        Q.offer(tmp);
                    }
                }
            }
            answer++;
        }
        return -1;
    }
}
