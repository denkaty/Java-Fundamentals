package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String joined = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(n -> Integer.parseInt(n))
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(" "));

        System.out.println(joined);
    }
}
