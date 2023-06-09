package com.codeup.code1060;

import java.util.Objects;
import java.util.Scanner;

public class Codeup1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cVal = sc.next();
        if (Objects.equals(cVal, "A"))
            System.out.println("best!!!");
        else if (Objects.equals(cVal, "B"))
            System.out.println("good!!");
        else if (Objects.equals(cVal, "C"))
            System.out.println("run!");
        else if (Objects.equals(cVal, "D"))
            System.out.println("slowly~");
        else
            System.out.println("what?");
        sc.close();
    }
}
