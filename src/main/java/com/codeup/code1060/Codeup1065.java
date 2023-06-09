package com.codeup.code1060;

import java.util.Scanner;

public class Codeup1065 {
    public static boolean isEvenNumb(int numb) {
        return (numb % 2) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        for (int i = 0; i < 3; i++) {
            if (isEvenNumb(arr[i]))
                System.out.println(arr[i]);
        }
        sc.close();
    }
}
