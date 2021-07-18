package com.company.Article_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];
            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String command = scanner.nextLine();
        if (command.equals("title")) {
            articles
                    .stream()
                    .sorted((p1, p2) -> p1.getTitle().compareTo(p2.getTitle()))
                    .forEach(p -> System.out.println(p.toString()));
        } else if (command.equals("content")) {
            articles
                    .stream()
                    .sorted((p1, p2) -> p1.getContent().compareTo(p2.getContent()))
                    .forEach(p -> System.out.println(p.toString()));
        } else if (command.equals("author")) {
            articles
                    .stream()
                    .sorted((p1, p2) -> p1.getAuthor().compareTo(p2.getAuthor()))
                    .forEach(p -> System.out.println(p.toString()));
        }

    }
}