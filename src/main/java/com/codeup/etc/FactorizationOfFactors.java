package com.codeup.etc;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorizationOfFactors {
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120852
    */
    public static void main(String[] args) {
        int n = 12;

        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && !arrayList.contains(i) && isPrime(i)) {
                arrayList.add(i);
            }
        }
        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++)
            answer[i] = arrayList.get(i);

        return answer;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
