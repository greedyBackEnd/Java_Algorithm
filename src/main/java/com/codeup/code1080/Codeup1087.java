package com.codeup.code1080;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= input; i++) {
            res += i;
            if (res >= input)
                break;
        }
        System.out.println(res);
        sc.close();
    }
}
