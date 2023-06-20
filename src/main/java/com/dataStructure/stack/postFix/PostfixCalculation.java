package com.dataStructure.stack.postFix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixCalculation {

    public void solution() throws IOException {
        // 입력 처리
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        Stack<Integer> digitStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);

            // 1. 숫자라면, 스택에 push
            if (Character.isDigit(token))
                digitStack.push(token - '0');
//                digitStack.push(Character.digit(token, 10));
                // 2. 숫자가 아니라면, (연산자) 스택에서 2번 pop하고 계산
            else {
                int popVal1 = digitStack.pop();
                int popVal2 = digitStack.pop();
                switch (token) {
                    case '+' -> digitStack.push(popVal1 + popVal2);
                    case '-' -> digitStack.push(popVal1 - popVal2);
                    case '*' -> digitStack.push(popVal1 * popVal2);
                    case '/' -> digitStack.push(popVal1 / popVal2);
                    default -> throw new IllegalArgumentException("잘못된 입력");
                }
            }
        }
        System.out.println(digitStack.pop());
    }

    public static void main(String[] args) throws IOException {
        new PostfixCalculation().solution();
    }
}
