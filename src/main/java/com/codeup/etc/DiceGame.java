package com.codeup.etc;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(solution(a, b, c));

        sc.close();
    }

    public static int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && a != c && b != c)
            answer = a + b + c;
        else if (a == b && b == c)
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        else
            answer = (a + b + c) * (a * a + b * b + c * c);

        return answer;
    }

}
