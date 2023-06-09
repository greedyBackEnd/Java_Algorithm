package com.codeup.code1620;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
        sc.close();
    }

    public static int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        while (answer / 10 > 0)
            answer = solution(answer);

        return answer;
    }
}
