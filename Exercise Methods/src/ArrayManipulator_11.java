import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        int[] array = new int[data.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(data[i]);
        }

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            String command = tokens[0];


            if ("exchange".equals(command)) {
                int index = Integer.parseInt(tokens[1]);

                if (index < 0 || index >= array.length) {
                    System.out.println("Invalid index");
                } else {
                    exchange(array, index);
                }
            } else if ("max".equals(command)) {
                String evenOrOdd = tokens[1];

                if (evenOrOdd.equals("even")) {
                    printMaxEven(array);
                } else if (evenOrOdd.equals("odd")) {
                    printMaxOdd(array);
                }
            } else if ("min".equals(command)) {
                String evenOrOdd = tokens[1];

                if (evenOrOdd.equals("even")) {
                    printMinEven(array);
                } else if (evenOrOdd.equals("odd")) {
                    printMinOdd(array);
                }
            } else if ("first".equals(command)) {
                int count = Integer.parseInt(tokens[1]);
                String evenOrOdd = tokens[2];

                if (count > array.length) {
                    System.out.println("Invalid count");
                } else if (evenOrOdd.equals("even")) {
                    printFirstCountEvenElements(array, count);
                } else if (evenOrOdd.equals("odd")) {
                    printFirstCountOddElements(array, count);
                }

            } else if ("last".equals(command)) {
                int count = Integer.parseInt(tokens[1]);
                String evenOrOdd = tokens[2];

                if (count > array.length) {
                    System.out.println("Invalid count");
                } else if (evenOrOdd.equals("even")) {
                    printLastCountEvenElements(array, count);
                } else if (evenOrOdd.equals("odd")) {
                    printLastCountOddElements(array, count);
                }

            }

            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }

    private static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    private static void exchange(int[] array, int index) {
        int[] temp = copyArray(array);
        int count = 0;

        for (int i = index + 1; i < temp.length; i++) {
            array[count] = temp[i];
            count++;
        }
        for (int i = 0; i <= index; i++) {
            array[count] = temp[i];
            count++;
        }

    }

    private static void printMaxEven(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }


    }

    private static void printMaxOdd(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }

    }

    private static void printMinEven(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printMinOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printFirstCountEvenElements(int[] array, int count) {
        int counterOfAllEvenElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counterOfAllEvenElements++;
            }
        }

        if (counterOfAllEvenElements == 0) {
            System.out.println("[]");
        } else if (counterOfAllEvenElements <= count) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    counterOfAllEvenElements--;
                    if (counterOfAllEvenElements > 0) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                    }
                }
            }
        } else {
            System.out.print("[");
            int numberOfPrints = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    numberOfPrints++;
                    if (numberOfPrints < count) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                        break;
                    }
                }
            }
        }
    }

    private static void printFirstCountOddElements(int[] array, int count) {
        int counterOfOddElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counterOfOddElements++;
            }
        }

        if (counterOfOddElements == 0 || count == 0) {
            System.out.println("[]");
        } else if (counterOfOddElements <= count) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    counterOfOddElements--;
                    if (counterOfOddElements > 0) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                    }
                }
            }
        } else {
            System.out.print("[");
            int numberOfPrints = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    numberOfPrints++;
                    if (numberOfPrints < count) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                        break;
                    }
                }
            }
        }
    }

    private static void printLastCountEvenElements(int[] array, int count) {
        int counterOfAllEvenElements = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                counterOfAllEvenElements++;
            }
        }

        if (counterOfAllEvenElements == 0) {
            System.out.println("[]");
        } else if (counterOfAllEvenElements <= count) {
            System.out.print("[");
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 0) {
                    counterOfAllEvenElements--;
                    if (counterOfAllEvenElements > 0) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                    }
                }
            }
        } else {
            System.out.print("[");
            int numberOfPrints = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 0) {
                    numberOfPrints++;
                    if (numberOfPrints < count) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                        break;
                    }
                }
            }
        }

    }

    private static void printLastCountOddElements(int[] array, int count) {
        int counterOfOddElements = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                counterOfOddElements++;
            }
        }

        if (counterOfOddElements == 0) {
            System.out.println("[]");
        } else if (counterOfOddElements <= count) {
            System.out.print("[");
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 != 0) {
                    counterOfOddElements--;
                    if (counterOfOddElements > 0) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                    }
                }
            }
        } else {
            System.out.print("[");
            int numberOfPrints = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 != 0) {
                    numberOfPrints++;
                    if (numberOfPrints < count) {
                        System.out.print(array[i] + ", ");
                    } else {
                        System.out.println(array[i] + "]");
                        break;
                    }
                }
            }
        }
    }
}