package com.codeup.etc;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Codeup1671TryAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        boolean win = false;
        while (!win) {
            System.out.print("가위 or 바위 or 보: ");
            int inputUser = strToInt(sc.nextLine());
            int pc = ran.nextInt(3);
            String res = gameRes(inputUser, pc);
            System.out.printf("user:%s, pc:%s 결과:%s\n", intToStr(inputUser), intToStr(pc), res);
            if (Objects.equals(res, "win")) win = true;
        }

    }

    public static String gameRes(int user, int pc) {
        if (user == 0 && pc == 1) return "win";
        else if (user == 1 && pc == 2) return "win";
        else if (user == 2 && pc == 0) return "win";
        else if (user == pc) return "tie";
        else return "lose";
    }

    public static int strToInt(String str) {
        return switch (str) {
            case "바위" -> 0;
            case "가위" -> 1;
            case "보" -> 2;
            default -> -1;
        };
    }

    public static String intToStr(int i) {
        return switch (i) {
            case 0 -> "바위";
            case 1 -> "가위";
            case 2 -> "보";
            default -> "잘못된 입력";
        };
    }
}
