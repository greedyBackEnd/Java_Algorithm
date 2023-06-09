package com.codeup.code1020;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sArr = str.split(":");
        System.out.printf("%d", Integer.parseInt(sArr[1]));
        sc.close();
    }
}
