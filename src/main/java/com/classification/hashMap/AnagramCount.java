package com.classification.hashMap;

import java.util.*;

public class AnagramCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        System.out.print(solution(s, t));
    }

    private static int solution(String s, String t) {
        int answer = 0;
        int lt = 0;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();


        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        for (int rt = 0; rt < s.length(); rt++) {
            mapS.put(s.charAt(rt), mapS.getOrDefault(s.charAt(rt), 0) + 1);

            if (rt >= t.length() - 1) {
                if (mapT.equals(mapS)) {
                    answer++;
                }
                if (mapS.get(s.charAt(lt)) > 1) {
                    mapS.put(s.charAt(lt), mapS.get(s.charAt(lt)) - 1);
                } else {
                    mapS.remove(s.charAt(lt));
                }
                lt++;
            }
        }

        return answer;
    }
}
