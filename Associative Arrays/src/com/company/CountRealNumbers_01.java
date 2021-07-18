package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(n -> Double.parseDouble(n))
                .collect(Collectors.toList());

        Map<Double, Integer> numberCounts = new TreeMap<>();

        for (Double currentNumber : numbers) {
            if (!numberCounts.containsKey(currentNumber)) {
                numberCounts.put(currentNumber, 1);
            } else {
                Integer currentCounts = numberCounts.get(currentNumber);
                currentCounts++;

                numberCounts.put(currentNumber, currentCounts);
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        for (Map.Entry<Double, Integer> entry : numberCounts.entrySet()) {
            Double number = entry.getKey();
            Integer counts = entry.getValue();

            System.out.printf("%s -> %d%n", decimalFormat.format(number), counts);
        }


    }
}
