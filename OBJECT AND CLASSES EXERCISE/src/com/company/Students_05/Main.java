package com.company.Students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String firstName = tokens[0];
            String secondName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);
            Student student = new Student(firstName, secondName, grade);
            students.add(student);
        }

        students
                .stream()
                .sorted((p1, p2) -> Double.compare(p2.getGrade(), p1.getGrade()))
                .forEach(p -> System.out.println(p.toString()));

    }
}
