package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printStudent("Pesho", 20, 5.66);
        printStudent("Gosho", 22, 5.96);
        printStudent("Tosho", 50, 5.56);

        String readFullName = readFullName(scanner);
        System.out.println(readFullName);

        String readFullNameSecond = readFullName(scanner);
        System.out.println(readFullNameSecond);
    }

    private static void printStudent(String name, int age, double grade) {
        System.out.printf("Student: %s; Age: %d, Grade: %.2f\n", name, age, grade);
    }

    private static String readFullName(Scanner scanner) {
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        return  firstName + " " + lastName;
    }
}
