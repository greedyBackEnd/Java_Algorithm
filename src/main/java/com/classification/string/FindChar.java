package com.classification.string;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next().toLowerCase();
        char inputChar = sc.next().toLowerCase().charAt(0);
        sc.close();

        System.out.print(solution(inputStr, inputChar));
    }

    private static int solution(String inputStr, char inputChar) {
        int answer = 0;
        for (char c : inputStr.toCharArray()) {
            if (c == inputChar) {
                answer++;
            }
        }
        return answer;
    }
}
