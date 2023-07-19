package com.classification.string;

import java.util.Scanner;

public class StringCompressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();
        System.out.println(solution(inputStr));
    }

    public static String solution(String inputStr) {
        String answer = "";
        inputStr += " ";
        char[] charArr = inputStr.toCharArray();
        int cnt = 1;
        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] == charArr[i + 1]) {
                cnt++;
            } else {
                answer += charArr[i];
                if (cnt > 1) answer += cnt;
                cnt = 1;
            }
        }
        return answer;
    }
}
