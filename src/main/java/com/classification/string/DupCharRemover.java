package com.classification.string;

import java.util.*;

public class DupCharRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();
        String result = solution(inputStr);
        System.out.println(result);
    }

    private static String solution(String inputStr) {
        StringBuilder answer = new StringBuilder();
        char[] inputArr = inputStr.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : inputArr) {
            if (!charList.contains(c)) {
                charList.add(c);
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
