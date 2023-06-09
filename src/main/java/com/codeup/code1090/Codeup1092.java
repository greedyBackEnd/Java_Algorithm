package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputA = sc.nextInt();
        int inputB = sc.nextInt();
        int inputC = sc.nextInt();
        int res = 1;

        while (res % inputA != 0 || res % inputB != 0 || res % inputC != 0)
            res++;
        System.out.println(res);
        sc.close();
    }
}
