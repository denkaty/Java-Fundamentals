import java.util.Scanner;

public class Vacation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        if (day.equals("Friday")) {
            if (type.equals("Students")) {
                price = 8.45;
            } else if (type.equals("Business")) {
                price = 10.90;
            } else if (type.equals("Regular")) {
                price = 15;
            }
        } else if (day.equals("Saturday")) {
            if (type.equals("Students")) {
                price = 9.80;
            } else if (type.equals("Business")) {
                price = 15.60;
            } else if (type.equals("Regular")) {
                price = 20;
            }
        } else {
            if (type.equals("Students")) {
                price = 10.46;
            } else if (type.equals("Business")) {
                price = 16;
            } else if (type.equals("Regular")) {
                price = 22.50;
            }
        }
        double totalPrice = people * price;
        if (type.equals("Students") && people >= 30) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (type.equals("Business") && people >= 100) {
            totalPrice = totalPrice - (10 * price);
        }else if (type.equals("Regular") && people >= 10 && people <= 20){
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        System.out.printf("Total price: %.02f", totalPrice);
    }
}
