package Exam_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MessageTranslator_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < numberOfMessages; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String command = matcher.group("command");
                String message = matcher.group("message");

                System.out.print(String.format("%s:", command));
                for (int g = 0; g < message.length(); g++) {
                    char currentChar = message.charAt(g);
                    System.out.print(String.format(" %s", (int) currentChar));
                }

                System.out.println();
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
