package com.company.JavaFundamentalsMidExam;

import java.util.Scanner;

public class SoftUniReception_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int totalAnswersForHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;

        int hours = 0;
        int fourthHour = 0;
        while (studentsCount > 0) {
            studentsCount = studentsCount - totalAnswersForHour;
            hours++;
            fourthHour++;
            if (hours % 4 == 0){
                fourthHour = 0;
                hours++;
            }
        }

        System.out.printf("Time needed: %dh.%n",hours);
        //11m


    }
}
