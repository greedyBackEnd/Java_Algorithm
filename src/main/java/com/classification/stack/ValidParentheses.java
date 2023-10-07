package com.classification.stack;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.print(solution(str));
    }

    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (Character c : str.toCharArray()) {
            if (c.equals('(')) stack.push(c);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";
        return answer;
    }
}
