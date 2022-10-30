package com.hillel.skoryk.homeworks.lesson5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть ім'я першої команди: ");
        String nameFirst = sc.nextLine();

        System.out.println("Введіть кількість фрагів для 5-ти гравців першої команди: ");
        int pointFirst = 0;
        for (int i = 0; i < 5; i++) {
            if (sc.hasNextInt()) {
                pointFirst += sc.nextInt();
            } else {
                System.out.println("Wrong data! Need to be 5 digits only.");
                System.exit(0);
            }
        }
        sc.nextLine();

        System.out.println("Введіть ім'я другої команди: ");
        String nameSecond = sc.nextLine();

        System.out.println("Введіть кількість фрагів для 5-ти гравців другої команди: ");
        int pointSecond = 0;
        for (int i = 0; i < 5; i++) {
            if (sc.hasNextInt()) {
                pointSecond += sc.nextInt();
            } else {
                System.out.println("Wrong data! Need to be 5 digits only.");
                System.exit(0);
            }
        }

        double midFirst = (double) pointFirst / 5;
        double midSecond = (double) pointSecond / 5;

        if (midFirst != midSecond) {
            System.out.println("Перемогла команда " + (midFirst > midSecond ? nameFirst : nameSecond)
                    + " набравши " + (midFirst > midSecond ? pointFirst : pointSecond) + " очків.");
        } else {
            System.out.println("Команда " + nameFirst + " і команда " + nameSecond
                    + " набрали рівну кількість очків: " + pointFirst);
        }
    }
}
