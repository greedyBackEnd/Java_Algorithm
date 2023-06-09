package com.codeup.etc;

public class SecretMap {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] res = solution(n, arr1, arr2);

        for (String row : res) {
            System.out.println(row);
        }
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            String binaryString = Integer.toBinaryString(combined);
            binaryString = String.format("%" + n + "s", binaryString);

            binaryString = binaryString.replace('1', '#');
            binaryString = binaryString.replace('0', ' ');

            answer[i] = binaryString;
        }
        return answer;
    }
}
