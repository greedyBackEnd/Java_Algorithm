package com.classification.twoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindCommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nList.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> mList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            mList.add(sc.nextInt());
        }
        sc.close();
        List<Integer> solution = solution(nList, mList);
        StringBuilder result = new StringBuilder();
        for (int i : solution)
            result.append(i).append(" ");
        System.out.println(result);
    }

    public static List<Integer> solution(List<Integer> nList, List<Integer> mList) {
        List<Integer> answer = new ArrayList<>();
        for (int nVal : nList) {
            if (mList.contains(nVal)) {
                answer.add(nVal);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
