package com.baekjoon.solved.class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputArr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int inputVal = sc.nextInt();
            int remainder = inputVal % 42;
            if (!inputArr.contains(remainder)) {
                inputArr.add(remainder);
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
