package com.classification.string;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();
        String result = solution(inputStr);
        System.out.println(result);
    }

    private static String solution(String inputStr) {
        String answer = "YES";
        char[] charArr = inputStr.toUpperCase().toCharArray();
        int lt = 0;
        int rt = charArr.length - 1;
        while (lt < rt) {
            if (charArr[lt] != charArr[rt]) {
                answer = "NO";
                break;
            } else {
                lt ++;
                rt --;
            }
        }
        return answer;
    }
}
