package com.classification.queue;

import java.util.*;

public class CurriculumDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strVal1 = sc.next();
        String strVal2 = sc.next();
        sc.close();
        System.out.println(solution(strVal1, strVal2));
    }

    public static String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (Character c : str1.toCharArray()) {
            queue.offer(c);
        }
        for (Character c : str2.toCharArray()) {
            if (queue.contains(c)) {
                if (queue.peek().equals(c)) queue.poll();
            }
        }
        if (!queue.isEmpty()) answer = "NO";

        return answer;
    }
}
