package com.codeup.code1010;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] arr = time.split(":");
        System.out.printf("%d:%d", Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        sc.close();
    }
}
