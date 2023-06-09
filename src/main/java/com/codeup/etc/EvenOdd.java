package com.codeup.etc;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        int oddConcat = 0;
        int evenConcat = 0;
        for (int i : num_list) {
            if (i %2 == 0)
                evenConcat = (evenConcat*10) + i;
            else
                oddConcat = (oddConcat*10) + i;
        }

        answer = oddConcat + evenConcat;

        return answer;
    }
}
