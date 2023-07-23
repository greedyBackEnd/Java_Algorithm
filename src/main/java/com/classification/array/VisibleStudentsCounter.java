package com.classification.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VisibleStudentsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intArr.add(Integer.parseInt(sc.next()));
        }
        System.out.println(solution(intArr));
    }

    public static int solution(List<Integer> intArr) {
        int answer = 1;
        int maxVal = intArr.get(0);
        for (int i = 1; i < intArr.size(); i++) {
            Integer intVal = intArr.get(i);
            if (intVal > maxVal) {
                maxVal = intVal;
                answer++;
            }
        }
        return answer;
    }
}
