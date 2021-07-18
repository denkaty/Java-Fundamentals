import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacityOfTheTank = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int sumOfInput = 0;

        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            sumOfInput += input;
            if (sumOfInput <= capacityOfTheTank){
                continue;
            }else {
                System.out.println("Insufficient capacity!");
                sumOfInput = sumOfInput - input;
            }
        }
        System.out.println(sumOfInput);
    }
}
