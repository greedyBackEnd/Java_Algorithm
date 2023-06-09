package com.codeup.etc;

import java.util.Scanner;

public class Codeup1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputMe = sc.nextInt();
        int inputPC = sc.nextInt();
        System.out.println(gameRes(inputMe, inputPC));
    }

    public static String gameRes(int user, int pc) {

        if (user == 0 && pc == 1) {
            return "win";
        } else if (user == 1 && pc == 2) {
            return "win";
        } else if (user == 2 && pc == 0) {
            return "win";
        } else if (user == pc) {
            return "tie";
        } else {
            return "lose";
        }
    }
}
