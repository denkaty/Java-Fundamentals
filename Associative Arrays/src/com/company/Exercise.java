package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //abc def ghi + Denkaty

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(word -> word + "Denkaty")
                .collect(Collectors.toList());

        System.out.println(input.toString().replaceAll("[\\[\\]]", ""));
    }
}
