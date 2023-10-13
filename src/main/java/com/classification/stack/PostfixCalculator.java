package com.classification.stack;

import java.util.*;

public class PostfixCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.print(solution(str));
    }

    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                Integer num2 = stack.pop();
                Integer num1 = stack.pop();
                stack.push(switch (c) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num1 / num2;
                    default -> throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
                });
            }
        }
        answer = stack.pop();
        return answer;
    }
}
