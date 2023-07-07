package com.classification.string;

import java.util.Scanner;

public class WordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().split(" ");
        System.out.println(solution(inputArr));
        sc.close();
    }

    private static String solution(String[] inputArr) {
        String answer = "";
        int maxLength = 0;
        int maxIdx = 0;
        for (int i = 0; i < inputArr.length; i++) {
            int length = inputArr[i].length();
            if (length > maxLength) {
                maxLength = length;
                maxIdx = i;
            }
        }
        answer = inputArr[maxIdx];
        return answer;
    }
}
