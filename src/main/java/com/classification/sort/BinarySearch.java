package com.classification.sort;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int[] tmpArr = new int[n];
        for (int i = 0; i < n; i++) {
            tmpArr[i] = arr[i];
        }
        Arrays.sort(tmpArr);
        answer = binarySearch(tmpArr, m, 0, n - 1) + 1;
        return answer;
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        int mid = (end + start) / 2;

        if (start <= end) {
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                return binarySearch(arr, target, start, mid - 1);
            else
                return binarySearch(arr, target, mid + 1, end);
        }
        return -1;
    }
}
