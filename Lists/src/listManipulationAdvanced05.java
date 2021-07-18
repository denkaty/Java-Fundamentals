import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listManipulationAdvanced05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        String[] tokens = scanner.nextLine().split(" ");
        String command = tokens[0];

        while (!command.equals("end")) {
            switch (command) {
                case "Contains":
                    printYesOrNo(numbers, tokens);
                    break;

                case "Print":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        printAllEven(numbers);
                    } else {
                        printAllOdd(numbers);
                    }
                    break;

                case "Get":
                    printSum(numbers, tokens);
                    break;

                case "Filter":
                    String condition = tokens[1];
                    int number = Integer.parseInt(tokens[2]);
                    if (condition.equals("<")) {
                        printSmaller(numbers, number);
                    } else if (condition.equals(">")) {
                        printBigger(numbers, number);
                    } else if (condition.equals("<=")) {
                        printSmallerOrEquals(numbers, number);
                    } else {
                        printBiggerOrEquals(numbers, number);
                    }
            }
            tokens = scanner.nextLine().split(" ");
            command = tokens[0];
        }

    }

    private static void printYesOrNo(List<Integer> numbers, String[] tokens) {
        int numberToCheck = Integer.parseInt(tokens[1]);
        boolean flag = false;
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber == numberToCheck) {
                flag = true;
            }
        }
        if (flag) {
            System.out.printf("Yes%n");
        } else {
            System.out.printf("No such number%n");
        }
    }


    private static void printAllEven(List<Integer> numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                counter++;
            }
        }
        int currentCounter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            Integer currentNumber = numbers.get(i);
            if (currentNumber % 2 == 0) {
                currentCounter++;
                if (currentCounter < counter) {
                    System.out.printf("%d ", currentNumber);
                } else {
                    System.out.printf("%d%n", currentNumber);
                }
            }
        }

    }

    private static void printAllOdd(List<Integer> numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                counter++;
            }
        }
        int currentCounter = 0;

        for (int i = 0; i < numbers.size(); i++) {
            Integer currentNumber = numbers.get(i);
            if (currentNumber % 2 != 0) {
                currentCounter++;
                if (currentCounter < counter) {
                    System.out.printf("%d ", currentNumber);
                }else {
                    System.out.printf("%d%n",currentNumber);
                }
            }
        }

    }

    private static void printSum(List<Integer> numbers, String[] tokens) {
        String whatToDo = tokens[1];
        int sumOfAllnumbers = 0;
        if (whatToDo.equals("sum")) {
            for (Integer currentNumber : numbers) {
                sumOfAllnumbers += currentNumber;
            }
            System.out.printf("%d%n",sumOfAllnumbers);
        }
    }

    private static void printSmaller(List<Integer> numbers, int number) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < number) {
                counter++;
            }
        }
        int currentNumber = 0;
        int currentCounter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            currentNumber = numbers.get(i);
            if (currentNumber < number) {
                currentCounter++;
                if (currentCounter < counter) {
                    System.out.printf("%d ",currentNumber);
                }else {
                    System.out.printf("%d%n",currentNumber);
                }
            }
        }
    }

    private static void printBigger(List<Integer> numbers, int number) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > number) {
                counter++;
            }
        }
        int currentNumber = 0;
        int currentCounter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            currentNumber = numbers.get(i);
            if (currentNumber > number) {
                currentCounter++;
                if (currentCounter<counter){
                    System.out.printf("%d ",currentNumber);
                }else {
                    System.out.printf("%d%n",currentNumber);
                }
            }
        }

    }

    private static void printSmallerOrEquals(List<Integer> numbers, int number) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= number) {
                counter++;
            }
        }
        int currentNumber = 0;
        int currentCounter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            currentNumber = numbers.get(i);
            if (currentNumber <= number) {
                currentCounter++;
                if (currentCounter < counter) {
                    System.out.printf("%d ",currentNumber);
                }else {
                    System.out.printf("%d%n",currentNumber);
                }
            }
        }
    }

    private static void printBiggerOrEquals(List<Integer> numbers, int number) {
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= number) {
                counter++;
            }
        }
        int currentNumber = 0;
        int currentCounter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            currentNumber = numbers.get(i);
            if (currentNumber >= number) {
                currentCounter++;
                if (currentCounter < counter) {
                    System.out.printf("%d ", currentNumber);
                }
                else {
                    System.out.printf("%d%n",currentNumber);
                }
            }
        }
    }
}
