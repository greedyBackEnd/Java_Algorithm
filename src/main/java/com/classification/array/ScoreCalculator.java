package com.classification.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputList.add(sc.nextInt());
        }
        sc.close();
        System.out.println(solution(inputList));
    }

    public static int solution(List<Integer> inputList) {
        int answer = 0;
        int tmp = 0;
        for (int i : inputList) {
            if (i == 1) answer += ++tmp;
            else tmp = 0;
        }

        return answer;
    }
}
