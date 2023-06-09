package com.codeup.code1020;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("'%s'\n", str.charAt(i));
        }
        sc.close();
    }
}
