package com.classification.stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.print(solution(str));
    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (Character c : str.toCharArray()) {
            if (c.equals('(')) stack.push(c);
            else if (c.equals(')')) stack.pop();
            else {
                if (stack.isEmpty()) answer.append(c);
            }
        }

        return answer.toString();
    }
}
