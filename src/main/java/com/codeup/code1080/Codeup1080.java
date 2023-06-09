package com.codeup.code1080;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sumRes = 0;
        for (int i = 1; i <=input; i++) {
            sumRes += i;
            if (sumRes >= input) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
