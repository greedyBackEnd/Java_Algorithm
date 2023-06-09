package com.codeup.code1080;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i < input + 1; i++) {
            if (i == 3 || i == 6 || i == 9)
                System.out.print("X ");
            else
                System.out.printf("%d ", i);
        }
        sc.close();
    }
}
