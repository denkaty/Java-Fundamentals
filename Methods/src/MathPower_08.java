import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double raisedNumber = raisedNumber(value,power);

        System.out.println(new DecimalFormat("0.####").format(raisedNumber));
    }
    public static double raisedNumber(double value, int power){
        double newNumber = 1;
        for (int i = 1; i <= power ; i++) {
            newNumber = newNumber * value;
        }
        return newNumber;
    }
}
