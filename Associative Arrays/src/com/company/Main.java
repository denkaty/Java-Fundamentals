package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> phonebook = new LinkedHashMap<>();
        phonebook.put("Pesho", 123);
        phonebook.put("Pesho1", 123);
        phonebook.put("Gosho", 123);
        phonebook.put("Pesho2", 123);
        phonebook.put("Pesho3", 123);
        phonebook.put("Pepi", 123);

        if (phonebook.containsKey("Gosho")) {
            phonebook.remove("Gosho");
            System.out.println("We successfully removed Gosho");
        }
        if (phonebook.containsKey("Pepi")) {
            phonebook.remove("Pepi");
            System.out.println("We successfully removed Pepi");
        }

        Integer pesho = phonebook.get("Pesho");

        phonebook.entrySet()
                .stream()
                .sorted((l, r) -> {
                    int leftLenghth = l.getKey().length();
                    int rightLenghth = r.getKey().length();

                    return leftLenghth - rightLenghth;
                })
                .collect(Collectors.toList());


        for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("Called from variable -> " + pesho);

        if (phonebook.containsKey("Pesho2")) {
            System.out.println("Yes, phonebook contains Pesho2");
        }

        int min = Arrays.stream(new int[]{1, 2, 3, 4, 5}).min().getAsInt(); //getAsInt - когато сме сигури, че ще има такова число
        System.out.println(min);
        int max = Arrays.stream(new int[]{1, 2, 3, 4, 5}).max().orElse(0);
        int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5}).sum();
        double average = Arrays.stream(new int[]{1, 2, 3, 4, 5}).average().getAsDouble();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int minimum = numbers
                .stream()
                .mapToInt(n -> n)   //няма нужда от модификация, защото List<Integer>
                .min()
                .orElse(-1); //когато четем от конзолата
        System.out.println(minimum);

        List<String> stringNumbers = Arrays.asList("1", "2", "3", "4", "5");
        int maximum = stringNumbers
                .stream()
                .mapToInt(n -> Integer.parseInt(n))   //има нужда от модификация, защото List<String>
                .max()
                .orElse(-1); //когато четем от конзола
        System.out.println(maximum);

        //NB!!! Използването на mapToInt, задължително изисква ламбда! mapToInt ни позволява да използваме методите с точка (.min;.max...)

//        int[] arrayReading = Arrays.stream(scanner.nextLine().split("\\s"))
//                .mapToInt(n -> Integer.parseInt(n))
//                .toArray();
//
//        List<Integer> listReading = Arrays.stream(scanner.nextLine().split("\\s"))
//                .map(n->Integer.parseInt(n))
//                .collect(Collectors.toList());
//
//        //sorted - соритране на нещата по някакъв ред
//
        List<String> someNumbers = Arrays.asList("6", "2", "7", "9", "3");
        List<Integer> sorted = someNumbers.stream()
                .map(n -> Integer.parseInt(n))
                .sorted((l, r) -> l.compareTo(r))  //от ляво на дясно (1,2,3,4,5,6,7,8,9)
                .collect(Collectors.toList());  //от дясно на ляво (9,8,7,6,5,4,3,2,1)


        System.out.println("SORTED!");
        System.out.println(sorted.toString().replaceAll("[\\[\\]]", ""));


    }
}
