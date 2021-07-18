package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
            sum += numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers.length - 1) {
                System.out.print(numbers[i] + " ");
            } else {
                System.out.println(numbers[i]);
            }
        }

        System.out.println(sum);
    }
}
