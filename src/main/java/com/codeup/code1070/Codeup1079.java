package com.codeup.code1070;

import java.util.Objects;
import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String cVal = sc.next();
            if (Objects.equals(cVal, "q")) {
                System.out.println(cVal);
                break;
            } else
                System.out.println(cVal);
        }
        sc.close();
    }
}
