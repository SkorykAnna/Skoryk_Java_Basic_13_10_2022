package com.hillel.skoryk.homeworks.lesson6;

import java.util.Scanner;

public class GuessNumWithFiveTry {
    public static void main(String[] args) {
        System.out.println("Вгадай число, яке 'загадав' комп'ютер з 5 спроб. Випробуй свою вдачу!");
        int random = (int) (Math.random() * 10);

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число від 0 до 10: ");

        for (int i = 1; i < 6 ; i++) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num < 0 || num > 10) {
                    System.out.println("Помилкові дані! Має бути число від 0 до 10! Спробуй ще раз.");
                    sc.nextLine();
                }
                if (num != random && (num >= 0 & num <= 10) && (i != 5)) {
                    System.out.println("Вибач, але ти не вгадав. :( \nСпробуй ще раз: ");
                    sc.nextLine();
                } else if (num == random) {
                    System.out.println("Вітаю! Ти вгадав!");
                    System.out.println("Загадане число було " + random + ".");
                    break;
                }
            } else {
                System.out.println("Помилкові дані! Має бути число від 0 до 10! Спробуй ще раз.");
                sc.nextLine();
            }
            if (i == 5) {
                System.out.println("Вибач, але ти використав усі свої спроби. Пощастить наступного разу!");
            }
        }
    }
}
