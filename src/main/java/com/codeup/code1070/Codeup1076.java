package com.codeup.code1070;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.next().charAt(0);
        for (int i = 97; i <= iVal; i++){
            System.out.printf("%s ", (char) i);
        }
        sc.close();
    }
}
