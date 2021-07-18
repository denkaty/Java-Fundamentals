import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int dayCounter = 0;
        int sumOfSpice = 0;

        while (startingYield >= 100) {
            dayCounter++;
            sumOfSpice += startingYield;
            sumOfSpice -= 26;
            startingYield -= 10;{
                if (startingYield < 100) {
                    sumOfSpice -=26;
                }
            }

        }
        System.out.println(dayCounter);
        System.out.println(sumOfSpice);
    }
}
