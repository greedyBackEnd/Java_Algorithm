package com.codeup.code1070;

import java.util.Scanner;

public class Codeup1070Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 12, 1, 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;
        }
        sc.close();
    }
}
