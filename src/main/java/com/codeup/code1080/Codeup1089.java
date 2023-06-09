package com.codeup.code1080;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int res = a;
        int cnt = 1;

        while (true) {
            res += d;
            cnt += 1;
            if (cnt == n)
                break;
        }
        System.out.println(res);
        sc.close();
    }
}
