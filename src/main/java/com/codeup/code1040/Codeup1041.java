package com.codeup.code1040;

import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.next().charAt(0);
        char res = (char) (iVal + 1);
        System.out.printf("%s", res);
        sc.close();
    }
}
