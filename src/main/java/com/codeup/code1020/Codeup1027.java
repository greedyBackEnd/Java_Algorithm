package com.codeup.code1020;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(arr[2]),
                Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
        sc.close();
    }
}
