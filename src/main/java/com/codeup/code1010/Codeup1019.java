package com.codeup.code1010;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] arr = date.split("\\.");
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(arr[0]),
                Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        sc.close();
    }
}
