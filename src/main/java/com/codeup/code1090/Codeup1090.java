package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        long res = a;
        for (int i = 1; i < n; i++) {
            res *= r;
        }

        System.out.println(res);
        sc.close();
    }
}
