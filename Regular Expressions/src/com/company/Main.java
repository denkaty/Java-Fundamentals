package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "RegExr was created by gskinner.com, and is proudly hosted by Media Temple.\n" +
                "Email: denisselim2003@gmail.com / dnk03@abv.bg\n" +
                "\n" +
                "Edit the Expression & Text to see matches. Roll over matches or the expression for details. PCRE & JavaScript flavors of RegEx are supported. Validate your expression with Tests mode.\n" +
                "\n" +
                "The side bar includes a Cheatsheet, full Reference, and Help. You can also Save & Share with the Community, and view patterns you create or favorite in My Patterns.\n" +
                "\n" +
                "Explore results with the Tools below. Replace & List output custom results. Details lists capture groups. Explain describes your expression in plain English.\n";

        Pattern pattern = Pattern.compile("(?<username>[\\w]+)@(?<mailType>[a-z]+\\.[a-z]+)");
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            String email = matcher.group();
            String username = matcher.group("username");
            String mailType = matcher.group("mailType");

            System.out.println(String.format("The email is: %s", email));
            System.out.println(String.format("Username: %s", username));
            System.out.println(String.format("The email type is: %s", mailType));

            System.out.println();
        }


        Pattern pattern1 = Pattern.compile("[A-Za-z]+");
        String text1 = "Hello Java";
        Matcher matcher1 = pattern1.matcher(text1);

        boolean matches1 = matcher1.find();
        if (matches1) {
            String replaceAll = matcher1.replaceAll("hi");
            System.out.println(replaceAll);
            String replaceFirst = matcher1.replaceFirst("hi");
            System.out.println(replaceFirst);

        }
    }
}
