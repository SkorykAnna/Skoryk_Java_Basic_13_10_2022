package com.hillel.skoryk.homeworks.lesson6;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        System.out.println("Вгадай число, яке 'загадав' комп'ютер. Випробуй свою вдачу!");
        int random = (int) (Math.random() * 11);

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть число від 0 до 10: ");

        for (; ; ) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num < 0 || num > 10) {
                    System.out.println("Помилкові дані! Має бути число від 0 до 10! Спробуй ще раз.");
                    sc.nextLine();
                }
                if (num != random && (num >= 0 & num <= 10)) {
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
        }
    }
}
