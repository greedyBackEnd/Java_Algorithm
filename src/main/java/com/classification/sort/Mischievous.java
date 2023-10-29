package com.classification.sort;

import java.util.*;

public class Mischievous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        ClassNum result = solution(n, arr);
        System.out.println(result.myClassNum + " " + result.friendClassNum);
    }

    public static ClassNum solution(int n, int[] arr) {
        ClassNum answer = new ClassNum();
        int[] tmpArr = arr.clone();
        boolean isFriend = false;
        Arrays.sort(tmpArr);
        for (int i = 0; i < n; i++) {
            if (tmpArr[i] != arr[i]) {
                if (!isFriend) {
                    answer.myClassNum = i + 1;
                    isFriend = true;
                } else
                    answer.friendClassNum = i + 1;
            }
        }
        return answer;
    }

    private static class ClassNum {
        int myClassNum;
        int friendClassNum;
    }
}
