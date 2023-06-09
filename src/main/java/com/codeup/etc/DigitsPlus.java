package com.codeup.etc;

public class DigitsPlus {
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/12931
     */
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
