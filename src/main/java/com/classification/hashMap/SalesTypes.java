package com.classification.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SalesTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (Integer integer : solution(n, k, arr)) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);

            if (rt >= k - 1) {
                answer.add(map.size());
                if (map.get(arr[lt]) > 1) {
                    map.put(arr[lt], map.get(arr[lt]) - 1);
                } else map.remove(arr[lt]);
                lt++;
            }

        }
        return answer;
    }
}
