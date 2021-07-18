package com.company;

import java.util.Scanner;

public class Main {//scanner - n    set int stoinosti    print int * 2  (ot 0 natatyk) (i obratno)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
//        for (int i = 0; i < numbers.length ; i++) {
//            System.out.println(numbers[i]);                //-> от началото до края (1, 2, 3, 4, 5)
//        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);                 //-> от края към началото (5, 4, 3, 2, 1)
        }
    }
}
