import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<customerName>[A-Z][a-z]+)%[^|$%.]*?<(?<product>[\\w]+)>[^|$%.]*?\\|(?<count>[\\d]+)\\|[^|$%.]*?(?<price>[\\d]+\\.?[\\d]+)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalMoneyForTheDay = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customerName = matcher.group("customerName");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double totalPrice = 1.00 * price * count;
                totalMoneyForTheDay += totalPrice;

                System.out.println(String.format("%s: %s - %.2f", customerName, product, totalPrice));

            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("Total income: %.2f", totalMoneyForTheDay));
    }
}
