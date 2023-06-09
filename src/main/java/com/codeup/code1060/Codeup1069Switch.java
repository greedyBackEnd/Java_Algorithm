package com.codeup.code1060;

import java.util.Scanner;

public class Codeup1069Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        switch (input){
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
        sc.close();
    }
}
