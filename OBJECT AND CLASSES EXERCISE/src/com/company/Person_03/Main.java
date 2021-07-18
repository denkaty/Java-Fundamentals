package com.company.Person_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] nameAndAge = scanner.nextLine().split("\\s+");
            String name = nameAndAge[0];
            int age = Integer.parseInt(nameAndAge[1]);

            Person person = new Person(name, age);
            if (person.getAge() > 30) {
                personList.add(person);
            }
        }
        personList
                .stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
    }
}
