package com.programmers.dfsbfs;

/*
    프로그래머스 타겟 넘버
    https://school.programmers.co.kr/learn/courses/30/lessons/43165
 */

public class Pro_43165 {
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    // 재귀함수 DFS 예정, 정답을 클래스 단위에서 관리
    private int answer = 0;

    // 재귀함수 DFS
    public void dfs(
            // 사용할 숫자들
            int[] numbers,
            // 다음에 사용할 차례의 숫자 (이번 DFS 호출에서 더하거나 뺄 숫자는 numbers[next] )
            int next,
            // 목표 값
            int target,
            // 이번 재귀까지 합한 값
            int sum
    ) {
        // 마지막 숫자를 쓴 시점에 next는 배열의 크기와 동일 (멈추는 시점)
        if (next == numbers.length) {
            // target과 일치하는지 확인
            if (sum == target) this.answer++;
        } else {
            // 더한 후, 다음 숫자 결정
            dfs(numbers, next + 1, target, sum + numbers[next]);
            // 뺀 후, 다음 숫자 결정
            dfs(numbers, next + 1, target, sum - numbers[next]);
        }
    }

    public static void main(String[] args) {
        int answer = new Pro_43165().solution(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(answer);
    }
}
