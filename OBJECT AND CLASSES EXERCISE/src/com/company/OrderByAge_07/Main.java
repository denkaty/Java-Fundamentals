package com.company.OrderByAge_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String input ="";
        while (!"End".equals(input = scanner.nextLine())){
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name,id,age);
            people.add(person);
        }
        people
                .stream()
                .sorted((p1,p2)->Integer.compare(p1.getAge(),p2.getAge()))
                .forEach(p-> System.out.println(p.toString()));
    }
}
