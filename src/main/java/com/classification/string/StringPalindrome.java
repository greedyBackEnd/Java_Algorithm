package com.classification.string;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        sc.close();
        String result = solution(inputStr);
        System.out.println(result);
    }

    public static String solution(String inputStr) {
        String answer = "YES";
        String replaced = inputStr.toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(replaced).reverse().toString();
        if (!replaced.equals(reversed)) {
            answer = "NO";
        }
        return answer;
    }
}
