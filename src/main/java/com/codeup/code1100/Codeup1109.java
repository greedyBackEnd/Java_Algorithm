package com.codeup.code1100;

import java.util.Scanner;

public class Codeup1109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        String depart = sc.next();
        float key = sc.nextFloat();

        System.out.println(name);
        System.out.println(age);
        System.out.println(depart);
        System.out.println(key);

        sc.close();
    }
}
