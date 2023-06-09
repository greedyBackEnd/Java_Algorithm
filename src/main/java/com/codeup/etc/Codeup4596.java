package com.codeup.etc;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = 0;
        int row = 0;
        int column = 0;
        int inputValue = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                inputValue = sc.nextInt();
                if (maxValue < inputValue) {
                    maxValue = inputValue;
                    row = j;
                    column = i;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(column + 1 + " " + (row % 9 + 1));

        sc.close();
    }
}
