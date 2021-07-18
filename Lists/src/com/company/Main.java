package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1,2,3,4,5,-1 --> 5,4,3,2,1

        List<Integer> inputNumbers = new ArrayList<>();

        int input = scanner.nextInt();

        while (input != -1) {
            inputNumbers.add(input);
            input = scanner.nextInt();
        }

        for (int i = inputNumbers.size() - 1; i >= 0 ; i--) {
            System.out.print(inputNumbers.get(i)+" ");
        }


    }
}
