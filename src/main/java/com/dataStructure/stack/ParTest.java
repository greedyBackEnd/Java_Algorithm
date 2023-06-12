package com.dataStructure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    괄호의 짝이 잘 맞는지 검사
    소괄호 한정
    (())(), ((()) ...
 */
public class ParTest {
    public boolean solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine(); // 괄호 입력

        Stack<Character> charStack = new Stack<>();

        // 문자열 길이만큼 순회
        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);

            // 1. 여는 괄호 만날 경우 push
            if (next == '(') {
                charStack.push(next);
            }
            // 2. 닫는 괄호 만날 경우
            else if (next == ')') {
                // a. pop할 게 없다면 실패 (return false) == 스택이 비어있음
                if (charStack.empty()) return false;
                // b. 아니라면  pop
                char top = charStack.pop();

                // c. pop의 결과로 나온 값이 여는 괄호인지 확인
                if (top != '(') return false;
            }
        }
        // 3. 순회가 끝날을 때 스택이 비었는지 확인
        return charStack.empty();
    }

    public static void main(String[] args) throws IOException {
        System.out.println((new ParTest()).solution());
    }
}
