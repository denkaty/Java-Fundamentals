package com.company.JavaFundamentalsMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> higherThanAverage = new ArrayList<>();

        List<Integer> numbersToPrint = new ArrayList<>();

        double averageValue = 0;
        for (Integer number : numbers) {
            averageValue += number;
        }
        averageValue = averageValue / numbers.size();

        for (Integer number : numbers) {
            if (number > averageValue) {
                higherThanAverage.add(number);
            }
        }

        Collections.sort(higherThanAverage, Collections.reverseOrder());

        int counter = 0;
        boolean flag = false;
        if (higherThanAverage.size() < 1) {
            System.out.println("No");
            flag = true;
        }
        if (!flag) {
            for (int i = 0; i < higherThanAverage.size(); i++) {
                if (i < higherThanAverage.size() - 1) {
                    System.out.print(higherThanAverage.get(i) + " ");
                } else {
                    System.out.print(higherThanAverage.get(i));
                }
                counter++;
                if (counter == 5) {
                    break;
                }
            }
        }

    }
}