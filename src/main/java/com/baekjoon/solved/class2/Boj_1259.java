package com.baekjoon.solved.class2;

import java.util.Scanner;

public class Boj_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String inputStr = sc.next();
            if (inputStr.equals("0")) break;

            String res = "yes";

            for (int i = 0; i < inputStr.length() / 2; i++) {
                if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() - i - 1)){
                    res = "no";
                    break;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
