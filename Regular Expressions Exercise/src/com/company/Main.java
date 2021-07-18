package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile(">>(?<furniture>[A-Z][A-Za-z]+)<<(?<price>[\\d]+\\.?[\\d]+)\\!(?<quantity>[\\d]+)");


        String input = scanner.nextLine();
        double totalSum = 0;
        List<String> furnitures = new ArrayList<>();
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitures.add(furniture);

                totalSum += price * quantity;
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String furniture : furnitures) {
            System.out.println(furniture);
        }
        System.out.println(String.format("Total money spend: %.2f", totalSum));


    }
}