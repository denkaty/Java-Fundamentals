import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        String largest = "";

        for (int i = 1; i <= numberOfKegs; i++) {
            String kegNumber = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * (radius * radius) * height;

            if (volume > max) {
                max = volume;
                largest = kegNumber;
            }
        }
        System.out.println(largest);
    }
}
