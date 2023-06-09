package com.codeup.code1090;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minNum = 23;
        for (int i = 0; i < n; i++) {
            int studentNum = sc.nextInt();
            if (studentNum < minNum)
                minNum = studentNum;
        }
        System.out.println(minNum);
        sc.close();
    }
}
