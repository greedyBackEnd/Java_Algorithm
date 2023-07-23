package com.classification.array;

import java.util.Scanner;

public class LargerNumberPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String inputStr = sc.nextLine();
        System.out.println(solution(n, inputStr));
    }

    public static String solution(int n, String inputStr) {
        String answer = "";
        String[] strArr = inputStr.split(" ");
        int minVal = 0;
        for (int i = 0; i < n; i++) {
            int parseInt = Integer.parseInt(strArr[i]);
            if (parseInt > minVal) {
                answer += parseInt + " ";
            }
            minVal = parseInt;
        }
        return answer;
    }
}
