package com.codeup.code1080;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(16);
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", input, i, input * i);
        }
        sc.close();
    }
}
