package com.classification.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        sc.close();
        System.out.println(solution(n, str));
    }

    private static char solution(int n, String str) {
        char answer = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (char key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }
}
