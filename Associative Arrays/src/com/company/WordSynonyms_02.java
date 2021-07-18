package com.company;

import java.util.*;

public class WordSynonyms_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordSynonyms.containsKey(word)) {
                List<String> synonymsList = new ArrayList<>();
                synonymsList.add(synonym);
                wordSynonyms.put(word, synonymsList);
            } else {
                List<String> existingSynonyms = wordSynonyms.get(word);
                existingSynonyms.add(synonym);

                wordSynonyms.put(word, existingSynonyms);
            }
        }

        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            String word = entry.getKey();
            List<String> synonyms = entry.getValue();
            String joinedSynonyms = synonyms.toString().replaceAll("[\\[\\]]", "");

            System.out.printf("%s - %s%n", word, joinedSynonyms);
        }


    }
}