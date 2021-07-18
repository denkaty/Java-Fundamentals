package com.company.JavaFundamentalsMidExam;

import java.util.Scanner;

public class ArrayModifier_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("end")) {
            String[] tokens = inputCommand.split("\\s");
            String command = tokens[0];


            if (command.equals("swap")){
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);

                int temporary = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = temporary;
            }
            else if (command.equals("multiply")){
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);

                numbers[index1] = numbers[index1] * numbers[index2];

            }
            else if (command.equals("decrease")){
                for (int i = 0; i <numbers.length ; i++) {
                    numbers[i] = numbers[i] - 1;
                }
            }


            inputCommand = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i<numbers.length-1){
                System.out.print(numbers[i]+", ");
            }else {
                System.out.print(numbers[i]);
            }
        }


    }
}
