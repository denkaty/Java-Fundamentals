package Exam_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("(@[\\#]{1,})([A-Z][A-Za-z0-9]{4,}[A-Z])(@[\\#]{1,})");

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                String productGroup = "";
                StringBuilder stringBuilder = new StringBuilder();

                for (int j = 0; j < barcode.length(); j++) {
                    char currentChar = barcode.charAt(j);

                    if (Character.isDigit(currentChar)) {
                        stringBuilder.append(currentChar);
                    }
                }
                productGroup = stringBuilder.toString();

                if (productGroup.equals("")) {
                    productGroup = "0" + "0";
                }
                System.out.println(String.format("Product group: %s", productGroup));

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
