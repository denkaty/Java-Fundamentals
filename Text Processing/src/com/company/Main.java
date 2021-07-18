package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "Hello, Java";
        int wordLength = word.length();
        System.out.println("Printing all chars from the word");
        for (int i = 0; i < wordLength; i++) {
            char currentChar = word.charAt(i);
            System.out.println(currentChar);
        }
        System.out.println();

        System.out.println("Printing first char (index = 0)");
        char ch = word.charAt(0);
        System.out.println(ch);
        System.out.println();

        System.out.println("Convert a string from and to a char array ");
        String string = new String(new char[]{'d','e','n','k','a','t','y'});
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            System.out.print(currentChar);
        }
        System.out.println();
        System.out.println();

        System.out.println("Concat method");
        String great = "Hello, ";
        String name = "denkaty";
        String result = great.concat(name);
        System.out.println(result);

        System.out.println();
        System.out.println("Repeating a string");
        String word2 = "abc";
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = word2;
        }
        String repeated = String.join("-",array);
        System.out.println(repeated);
        System.out.println();

        System.out.println("Replace char");
        String word3 = "Hello";
        String replaced = word3.replace('H', 'h');
        System.out.println(replaced);
        System.out.println();

        System.out.println("String substring");
        String card = "10c";
        String power = card.substring(0,2);
        System.out.println(power);
        String text = "My name is denkaty";
        String substring = text.substring(11);
        System.out.println(substring);
        System.out.println();

        System.out.println("Index of");
        String fruits = "banana, apple, kiwi, banana, apple";
        System.out.println(fruits.indexOf("banana")); //0
        System.out.println(fruits.indexOf("apple"));  //8
        System.out.println(fruits.indexOf("orange")); //-1 (doesnt exist)
        System.out.println("Last index of");
        System.out.println(fruits.lastIndexOf("banana")); //21
        System.out.println(fruits.lastIndexOf("apple"));  //29
        System.out.println(fruits.lastIndexOf("orange")); //-1 (doesnt exist)
        System.out.println();

        System.out.println("String contains");
        String apples = "green, red, yellow";
        System.out.println(apples.contains("green"));
        System.out.println(apples.contains("blue"));
        System.out.println();

        System.out.println("StringBuilder");
        StringBuilder sb = new StringBuilder(); //"sb" is name.
                                                // Every time we have to create a new SB with different name.

    }
}
