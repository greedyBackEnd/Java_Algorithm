package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] students = new int[23];
        for (int i = 0; i < n; i++) {
            students[sc.nextInt() - 1] += 1;
        }
        for (int student : students)
            System.out.print(student + " ");

        sc.close();
    }
}
