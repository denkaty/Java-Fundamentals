package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(n -> Integer.parseInt(n))
                .map(n->n*2)
                .filter(n-> n >= 100)
                .collect(Collectors.toList());

        System.out.println(numbers.toString().replaceAll("[\\[\\]]",""));
    }
}
