package com.classification.hashMap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strVal1 = sc.next();
        String strVal2 = sc.next();
        sc.close();
        System.out.print(solution(strVal1, strVal2));
    }

    private static String solution(String strVal1, String strVal2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char key : strVal1.toCharArray()) {
            map1.put(key, map1.getOrDefault(key, 0) + 1);
        }
        for (char key : strVal2.toCharArray()) {
            map2.put(key, map2.getOrDefault(key, 0) + 1);
        }

        for (char key : strVal2.toCharArray()) {
            if (!map1.containsKey(key) || !Objects.equals(map1.get(key), map2.get(key))) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }
}
