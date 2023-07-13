package com.classification.string;

import java.util.Scanner;

public class SpecificWordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //65~90 97~122
        String inputStr = sc.next();
        sc.close();
        System.out.println(solution(inputStr));
    }

    private static String solution(String inputStr) {
        char[] answer = inputStr.toCharArray();
        int lt = 0, rt = answer.length - 1;
        while (lt < rt) {
            char l = answer[lt];
            char r = answer[rt];
            if (!Character.isAlphabetic(l)) {
                lt++;
            } else if (!Character.isAlphabetic(r)) {
                rt--;
            } else {
                answer[lt] = r;
                answer[rt] = l;
                lt++;
                rt--;
            }
        }
        return String.valueOf(answer);
    }
}
