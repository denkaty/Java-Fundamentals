package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s"))
                .collect(Collectors.toList());

        Map<String, Integer> wordAndCounts = new LinkedHashMap<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();

            if (!wordAndCounts.containsKey(lowerCaseWord)) {
                wordAndCounts.put(lowerCaseWord, 1);
            } else {
                Integer counts = wordAndCounts.get(lowerCaseWord);
                counts++;

                wordAndCounts.put(lowerCaseWord, counts);
            }
        }

        List<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordAndCounts.entrySet()) {
            Integer counts = entry.getValue();
            String word = entry.getKey();

            if (counts % 2 == 1) {
                oddWords.add(word);
            }
        }

        String joined = oddWords.toString().replaceAll("[\\[\\]]", "");
        System.out.println(joined);
    }
}