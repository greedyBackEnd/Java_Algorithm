package com.codeup.code1070;

import java.util.Scanner;

public class Codeup1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        if (iVal==12 || iVal==1 || iVal==2)
            System.out.println("winter");
        else if (iVal==3 || iVal==4 || iVal==5)
            System.out.println("spring");
        else if (iVal==6 || iVal==7 || iVal==8)
            System.out.println("summer");
        else
            System.out.println("fall");
        sc.close();
    }
}
