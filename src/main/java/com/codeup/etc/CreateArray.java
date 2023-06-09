package com.codeup.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray {
    public static void main(String[] args) {
        int i = 50;
        int r = 555;
        int[] arr = solution(i, r);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] solution(int i, int r) {
        List<Integer> solutionList = new ArrayList<>();
        for (int j = i; j <= r; j++) {
            if (is0And5(j))
                solutionList.add(j);
        }

        if (solutionList.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[solutionList.size()];
        for (int k = 0; k <answer.length ; k++) {
            answer[k] = solutionList.get(k);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static boolean is0And5(int number) {
        String numStr = Integer.toString(number);
        for (char digit : numStr.toCharArray()){
            if (digit != '0' && digit != '5') {
                return false;
            }
        }
        return true;
    }
}
