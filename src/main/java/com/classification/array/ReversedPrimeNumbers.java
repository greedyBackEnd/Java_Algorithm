package com.classification.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integerList.add(sc.nextInt());
        }
        sc.close();

        for (int i : solution(integerList)) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> solution(List<Integer> integerList) {
        List<Integer> answer = new ArrayList<>();
        for (int i : integerList) {
            int reversed = reverseNum(i);
            if (isPrime(reversed)) {
                answer.add(reversed);
            }
        }
        return answer;
    }

    public static int reverseNum(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
