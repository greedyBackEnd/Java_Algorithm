package com.codeup.etc;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(solution(input));
        sc.close();
    }

    public static int solution(int num) {
        int answer = 0;
        long inputNum = num;
        while (inputNum != 1) {
            if (answer >= 500) {
                return -1;
            }
            if (inputNum % 2 == 0)
                inputNum /= 2;
            else
                inputNum = inputNum * 3 + 1;
            answer++;
        }
        return answer;
    }
}
