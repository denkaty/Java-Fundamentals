package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {

            if (isValidUsername(username)) {
                System.out.println(username);
            }

        }
    }

    private static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        } else {
            for (int i = 0; i < username.length(); i++) {
                char currentChar = username.charAt(i);

                if (!Character.isLetterOrDigit(currentChar) && currentChar != '-' && currentChar != '_') {
                    return false;
                }
            }

        }
        return true;
    }
}
