package com.classification.string;

import java.util.Scanner;

public class NumberExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();
        String result = solution(inputStr);
        System.out.println(result);
    }

    public static String solution(String inputStr) {
        String answer = "";
        int replacedInt = Integer.parseInt(inputStr.replaceAll("[^0-9]", ""));
        answer = Integer.toString(replacedInt);
        return answer;
    }
}
