package com.baekjoon.solved.class1;

import java.util.Scanner;

public class Boj_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine().strip();
        sc.close();

        if (inputStr.isEmpty())
            System.out.println(0);
        else
            System.out.println(inputStr.split(" ").length);
    }
}
