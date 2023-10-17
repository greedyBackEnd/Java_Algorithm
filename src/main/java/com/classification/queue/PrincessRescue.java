package com.classification.queue;

import java.util.*;

public class PrincessRescue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(solution(n, k));
    }

    public static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        int tmp = 0;
        while (queue.size() != 1) {
            if (++tmp == k) {
                queue.poll();
                tmp = 0;
            } else {
                queue.offer(queue.poll());
            }
        }
        answer = queue.peek();
        return answer;
    }
}
