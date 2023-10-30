package com.classification.sort;

import java.util.*;

public class SortCoordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> inputCoordinates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputCoordinates.add(new Point(sc.nextInt(), sc.nextInt()));
        }
        sc.close();
        List<Point> result = solution(n, inputCoordinates);
        for (Point point : result) {
            System.out.println(point.x + " " + point.y);
        }
    }

    public static List<Point> solution(int n, List<Point> coordinates) {
        List<Point> answer = new ArrayList<>(coordinates);
        Collections.sort(answer);
        return answer;
    }

    private static class Point implements Comparable<Point> {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }
}
