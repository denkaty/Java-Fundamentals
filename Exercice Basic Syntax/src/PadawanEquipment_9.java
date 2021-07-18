import java.util.Scanner;

public class PadawanEquipment_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = Double.parseDouble(scanner.nextLine());
        int totalStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());


        double LightsabersPrice = Math.ceil(totalStudents * 0.1 + totalStudents)*priceOfLightsabers;
        double RobesPrice = totalStudents * priceOfRobes;
        double BeltsPrice = totalStudents * priceOfBelts;
        int freeBelt = totalStudents / 6;

        double totalPrice = LightsabersPrice + RobesPrice + (BeltsPrice - (freeBelt * priceOfBelts));

        if (totalPrice <= totalMoney) {
            System.out.printf("The money is enough - it would cost %.02flv.", totalPrice);
        } else {
            double moneyNeeded = totalPrice - totalMoney;
            System.out.printf("Ivan Cho will need %.02flv more.", moneyNeeded);
        }
    }
}
