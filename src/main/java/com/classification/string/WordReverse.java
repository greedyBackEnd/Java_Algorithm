package com.classification.string;

import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String inputStr = sc.next();
            System.out.println(solution(inputStr));
        }
        sc.close();
    }

    private static String solution(String inputStr) {
        String answer = new StringBuilder(inputStr).reverse().toString();
        return answer;
    }
}
