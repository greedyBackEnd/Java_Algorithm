package com.codeup.code1070;

import java.util.Scanner;

public class Codeup1073DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            System.out.println(num);
        } while (num != 0);
        sc.close();
    }
}
