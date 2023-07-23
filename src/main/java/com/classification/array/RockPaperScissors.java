package com.classification.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> inputA = new ArrayList<>();
        List<Integer> inputB = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputA.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < n; i++) {
            inputB.add(Integer.parseInt(sc.next()));
        }
        for (String result : solution(n, inputA, inputB)) {
            System.out.println(result);
        }
    }

    public static List<String> solution(int n, List<Integer> inputA, List<Integer> inputB) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer aVal = inputA.get(i);
            Integer bVal = inputB.get(i);
            if ((aVal - bVal == -2) || (aVal - bVal == 1)) answer.add("A");
            else if ((bVal - aVal == -2) || (bVal - aVal == 1)) answer.add("B");
            else answer.add("D");
        }
        return answer;
    }
}
