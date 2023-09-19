package com.classification.twoPointers;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }
        sc.close();
        for (int i : solution(n, nArr, m, mArr))
            System.out.print(i + " ");
    }

    private static int[] solution(int n, int[] nArr, int m, int[] mArr) {
        int[] answer = new int[n + m];
        int nIdx = 0;
        int mIdx = 0;
        for (int i = 0; i < n + m; i++) {
            if (nIdx < n && mIdx < m) {
                if (nArr[nIdx] < mArr[mIdx]) {
                    answer[i] = nArr[nIdx++];
                } else if (nArr[nIdx] > mArr[mIdx]) {
                    answer[i] = mArr[mIdx++];
                } else {
                    answer[i] = nArr[nIdx++];
                    answer[++i] = mArr[mIdx++];
                }
            } else {
                if (nIdx >= n) {
                    answer[i] = mArr[mIdx++];
                } else {
                    answer[i] = nArr[nIdx++];
                }
            }
        }
        return answer;
    }
}
