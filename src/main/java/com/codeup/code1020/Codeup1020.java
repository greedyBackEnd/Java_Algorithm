package com.codeup.code1020;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numb = sc.nextLine();
        String[] arr = numb.split("-");
        System.out.printf("%s%s", arr[0], arr[1]);
        sc.close();
    }
}
