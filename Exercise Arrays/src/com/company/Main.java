package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());
        int sumOfPeople = 0;
        int[] peopleInSingleWagon = new int[countOfWagons];
        for (int i = 0; i < peopleInSingleWagon.length; i++) {
            peopleInSingleWagon[i] = Integer.parseInt(scanner.nextLine());
            sumOfPeople += peopleInSingleWagon[i];
        }
        for (int i = 0; i < peopleInSingleWagon.length ; i++) {
            if (i < peopleInSingleWagon.length-1){
                System.out.print(peopleInSingleWagon[i]+" ");
            }else {
                System.out.println(peopleInSingleWagon[i]);
            }
        }
        System.out.println(sumOfPeople);


    }
}
