package com.classification.string;

import java.util.Scanner;

public class SecretMessageDecoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        sc.close();
        System.out.println(solution(n, str));
    }

    public static String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String substring = str.substring(7 * i, 7 * i + 7);
            String replaced = substring.replace("#", "1").replace("*", "0");
            int parsed = Integer.parseInt(replaced, 2);
            answer += (char) parsed;
        }
        return answer;
    }
}
