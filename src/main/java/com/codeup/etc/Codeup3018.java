package com.codeup.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.no, s.getNo());
    }
}

class SchoolSystem {
    private final List<Student> students;

    public SchoolSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            Collections.sort(students);
        }
    }

    public void removeStudent(int no) {
        students.removeIf(student -> student.getNo() == no);
    }

    public List<Student> getStudentsAtPositions(int[] positions) {
        List<Student> students = new ArrayList<>();
        for (int position : positions) {
            students.add(students.get(position - 1));
        }
        return students;
    }
}

public class Codeup3018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        SchoolSystem schoolSystem = new SchoolSystem();

        for (int i = 0; i < n; i++) {
            String code = scanner.next();
            int no = scanner.nextInt();
            String name = scanner.next();

            if (code.equals("I")) {
                schoolSystem.addStudent(new Student(no, name));
            } else if (code.equals("D")) {
                schoolSystem.removeStudent(no);
            }
        }

        int[] positions = new int[5];
        for (int i = 0; i < 5; i++) {
            positions[i] = scanner.nextInt();
        }

        List<Student> students = schoolSystem.getStudentsAtPositions(positions);
        for (Student student : students) {
            System.out.println(student.getNo() + " " + student.getName());
        }
    }
}
