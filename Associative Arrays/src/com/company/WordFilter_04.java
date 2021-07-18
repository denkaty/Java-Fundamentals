package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s"))
                .filter(w -> w.length() % 2 == 0)
                .limit(3)
                .forEach(w -> System.out.println(w));
    }
}
