package com.classification.queue;

import java.util.*;

public class EmergencyRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println(solution(n, m, list));
    }

    public static int solution(int n, int m, List<Integer> list) {
        int answer = 0;
        Queue<Patient> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Patient(i, list.get(i)));
        }

        while (!queue.isEmpty()) {
            Patient tmpPatient = queue.poll();
            for (Patient x : queue) {
                if (x.priority > tmpPatient.priority) {
                    queue.offer(tmpPatient);
                    tmpPatient = null;
                    break;
                }
            }
            if (tmpPatient != null) {
                answer++;
                if (tmpPatient.order == m) return answer;
            }
        }

        return answer;
    }

    static class Patient {
        Integer order;
        Integer priority;

        public Patient(int order, int hazard) {
            this.order = order;
            this.priority = hazard;
        }
    }
}
