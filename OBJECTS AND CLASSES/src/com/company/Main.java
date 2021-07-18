package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Lecture {
        String name;
        int day;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*

        Lecture today = new Lecture();
        today.name = "Classes and Objects";
        today.day = 296;
        System.out.printf("Today is %d. The lecture`s name is %s%n", today.day, today.name);

        Lecture tommorow = new Lecture();
        tommorow.name = "Mid exam prep";
        tommorow.day = 303;
        System.out.printf("Today is %d. The lecture`s name is %s%n", tommorow.day, tommorow.name);

        System.out.println();

         */

        List<Lecture> lectures = new ArrayList<>();
        int numLectures = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numLectures; i++) {
            String name = scanner.next();
            int day = scanner.nextInt();

            Lecture current = new Lecture();
            current.name = name;
            current.day = day;

            lectures.add(current);
        }
        int querryDay = scanner.nextInt();
        Lecture found = getLecture(lectures, querryDay);

        if (found != null) {
            System.out.println(found.name + " " + found.day);
        } else {
            System.out.println("No lecture at that day");
        }

    }

    private static Lecture getLecture(List<Lecture> lectures, int querryDay) {
        Lecture found = null;

        for (Lecture lecture : lectures) {
            if (querryDay == lecture.day) {
                found = lecture;
                break;
            }
        }
        return found;
    }
}

/*
3
Objects_and_Classes 296
Mid_exam_prep 303
Associative_arrays 310
303
 */
