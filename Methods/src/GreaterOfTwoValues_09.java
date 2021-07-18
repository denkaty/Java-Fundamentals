import java.util.Scanner;

public class GreaterOfTwoValues_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfValue = scanner.nextLine();

        if (typeOfValue.equals("int")) {
            int firstValue = Integer.parseInt(scanner.nextLine());
            int secondValue = Integer.parseInt(scanner.nextLine());

            int greater = getMax(firstValue, secondValue);
            System.out.println(greater);
        }

        if (typeOfValue.equals("char")) {
            char firstValue = scanner.nextLine().charAt(0);
            char secondValue = scanner.nextLine().charAt(0);

            char greater = getMax(firstValue, secondValue);
            System.out.println(greater);
        }

        if (typeOfValue.equals("string")) {
            String firstValue = scanner.nextLine();
            String secondValue = scanner.nextLine();

            String greater = getMax(firstValue, secondValue);

            System.out.println(greater);
        }


    }

    private static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

    private static char getMax(char firstValue, char secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

    private static String getMax(String firstValue, String secondValue) {
        if (firstValue.compareTo(secondValue) >= 0) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

}
