package com.classification.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int result : solution(n)) {
            System.out.print(result + " ");
        }
    }

    public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            answer.add(1);
        }
        for (int i = 2; i < n; i++) {
            answer.add(answer.get(i - 1) + answer.get(i - 2));
        }
        return answer;
    }
}
