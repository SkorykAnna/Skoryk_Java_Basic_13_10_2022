package com.hillel.skoryk.homeworks.lesson10;

import java.util.Scanner;

public class PersonUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть ім'я: ");
        String name = sc.toString();
        sc.nextLine();

        System.out.print("Введіть прізвище: ");
        String surname = sc.toString();
        sc.nextLine();

        System.out.print("Введіть місто: ");
        String city = sc.toString();
        sc.nextLine();

        System.out.print("Введіть номер телефону: ");
        long number = inSys();

        System.out.println();

        System.out.println(personInfo(name, surname, city, number));

    }

    private static String personInfo (String name, String surname, String city, long number) {
        String callInfo = "Зателефонувати громадянинові " + name + " " + surname +
                " з міста " + city + " можна за номером " + number + ".";
        return callInfo;
    }

    private static long inSys() {

        Scanner sc = new Scanner(System.in);

        long number;

        for (; ; ) {
            if (!sc.hasNextLong()) {
                System.out.println("Помилкові дані! Має бути додатнє число. Спробуй ще раз:");
                sc.nextLine();
            } else {
                number = sc.nextLong();
                if (number <= 0) {
                    System.out.println("Помилкові дані! Має бути додатнє число. Спробуй ще раз:");
                    sc.nextLine();
                    continue;
                }
                break;
            }
        }

        return number;
    }

//    private static String inSysString() {
//
//        Scanner sc = new Scanner(System.in);
//
//        String inSc = sc.toString();
//        sc.nextLine();
//
//        return inSc;
//    }

}
