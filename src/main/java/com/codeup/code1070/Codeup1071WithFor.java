package com.codeup.code1070;

import java.util.Scanner;

public class Codeup1071WithFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int input = sc.nextInt();
            if (input==0)
                break;
            else
                System.out.println(i);
        }
        sc.close();
    }
}
