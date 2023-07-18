package com.classification.string;

import java.util.Scanner;

public class ShortestDistanceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        sc.close();
        String result = solution(s, t);
        System.out.println(result);
    }

    public static String solution(String s, char t) {
        String answer = "";
        int[] intArr = new int[s.length()];
        char[] charArr = s.toCharArray();
        int p = 10000;
        for (int i = 0; i < s.length(); i++) {
            if (charArr[i] == t) {
                p = 0;
            }
            intArr[i] = p++;
        }
        p = 10000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (charArr[i] == t) {
                p = 0;
            }
            if (intArr[i] > p) {
                intArr[i] = ++p;
            }
        }
        for (int i : intArr) {
            answer += i + " ";
        }
        return answer;
    }
}
