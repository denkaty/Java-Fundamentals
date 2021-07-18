package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class SecondMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //min, max, sum ,average(double)
        //array {1,2,3,4,5) map
        //list (string) 1,2,3,4,5
        //read array and map it
        //read list and map it

        //Използваме mapToInt, когато искаме да използваме ".min", ".average"

        int min = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .min()
                .getAsInt(); //тук сме сигурни че ще получим правилно число, защото не четем от конзолата масива

        int max = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .max()
                .getAsInt(); //тук сме сигурни че ще получим правилно число, защото не четем от конзолата масива

        int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .sum();

        double average = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .average()
                .getAsDouble();


        //Reading from console ->

        int[] arrayReading = Arrays.stream(scanner.nextLine().split("\\s"))
                .mapToInt(n -> Integer.parseInt(n))
                .toArray();

        List<Integer> listReading = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(n -> Integer.parseInt(n))
                .collect(Collectors.toList());

    }
}
