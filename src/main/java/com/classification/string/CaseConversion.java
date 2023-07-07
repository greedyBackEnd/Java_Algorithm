package com.classification.string;

import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        System.out.println(solution(inputStr));
        sc.close();
    }

    private static String solution(String inputStr) {
        String answer = "";

        for (char c : inputStr.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        return answer;
    }
}
