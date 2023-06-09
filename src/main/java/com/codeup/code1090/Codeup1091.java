package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long res = a;

        for (int i = 1; i < n ; i++) {
            res = res*(m) + d;
        }
        System.out.println(res);
        sc.close();
    }
}
