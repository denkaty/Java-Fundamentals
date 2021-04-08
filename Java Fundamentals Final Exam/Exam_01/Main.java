package Exam_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //Start 17.15
        Scanner scanner = new Scanner(System.in);

        String encrypted = scanner.nextLine();

        String finishCommand = scanner.nextLine();
        while (!finishCommand.equals("Finish")) {
            String[] tokens = finishCommand.split("\\s+");
            String command = tokens[0];

            if (command.equals("Replace")) {
                char oldChar = tokens[1].charAt(0);
                char newChar = tokens[2].charAt(0);
                encrypted = replaceMethod(encrypted, oldChar, newChar);
                System.out.println(encrypted);
            } else if (command.equals("Cut")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                if (areValidIndexes(encrypted, startIndex, endIndex)) {
                    encrypted = cutMethond(encrypted, startIndex, endIndex);
                    System.out.println(encrypted);
                } else {
                    System.out.println("Invalid indexes!");
                }
            } else if (command.equals("Make")) {
                String upperOrLower = tokens[1];
                encrypted = makeUpperOrLower(encrypted, upperOrLower);
                System.out.println(encrypted);
            } else if (command.equals("Check")) {
                String containsString = tokens[1];
                checkIfContainsString(encrypted, containsString);
            } else if (command.equals("Sum")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                if (areValidIndexes(encrypted, startIndex, endIndex)) {
                    printSum(encrypted, startIndex, endIndex);
                } else {
                    System.out.println("Invalid indexes!");
                }
            }

            finishCommand = scanner.nextLine();
        }
    }

    private static String replaceMethod(String encrypted, char oldChar, char newChar) {
        encrypted = encrypted.replace(oldChar, newChar);
        return encrypted;
    }

    private static String cutMethond(String encrypted, int startIndex, int endIndex) {
        StringBuilder sb = new StringBuilder(encrypted);
        encrypted = String.valueOf(sb.delete(startIndex, endIndex + 1));

        return encrypted;
    }

    private static String makeUpperOrLower(String encrypted, String upperOrLower) {
        if (upperOrLower.equals("Upper")) {
            encrypted = encrypted.toUpperCase();
        } else {
            encrypted = encrypted.toLowerCase();
        }
        return encrypted;
    }

    private static void checkIfContainsString(String encrypted, String containsString) {
        if (encrypted.contains(containsString)) {
            System.out.println(String.format("Message contains %s", containsString));
        } else {
            System.out.println(String.format("Message doesn't contain %s", containsString));
        }
    }

    private static void printSum(String encrypted, int startIndex, int endIndex) {
        String substring = encrypted.substring(startIndex, endIndex + 1);
        int sum = 0;
        for (int i = 0; i < substring.length(); i++) {
            char currentChar = substring.charAt(i);
            sum += currentChar;
        }
        System.out.println(sum);
    }

    private static boolean areValidIndexes(String encrypted, int startIndex, int endIndex) {
        if (startIndex >= 0 && startIndex < encrypted.length() && endIndex >= 0 && endIndex < encrypted.length()) {
            return true;
        } else {
            return false;
        }
    }
}
