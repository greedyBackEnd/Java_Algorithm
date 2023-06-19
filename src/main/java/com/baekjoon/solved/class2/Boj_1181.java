package com.baekjoon.solved.class2;

import java.util.*;

public class Boj_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String inputStr = sc.next();
            arr.add(inputStr);
        }

        arr.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
        sc.close();
    }
}
