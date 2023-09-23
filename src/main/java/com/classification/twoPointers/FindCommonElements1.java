package com.classification.twoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindCommonElements1 {
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
        Collections.sort(nList);
        Collections.sort(mList);
        int nIdx = 0;
        int mIdx = 0;
        while (nIdx < nList.size() && mIdx < mList.size()) {
            if (nList.get(nIdx) > mList.get(mIdx)) {
                mIdx++;
            } else if (nList.get(nIdx) < mList.get(mIdx)) {
                nIdx++;
            } else {
                answer.add(nList.get(nIdx));
                nIdx++;
                mIdx++;
            }
        }
        return answer;
    }
}
