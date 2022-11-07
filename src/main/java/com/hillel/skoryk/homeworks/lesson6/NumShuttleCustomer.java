package com.hillel.skoryk.homeworks.lesson6;

import java.util.Scanner;

public class NumShuttleCustomer {
    public static void main(String[] args) {
        System.out.println("У Японії цифри 4 та 9 вважаються нещасливими.");
        System.out.println("Тому пропонуємо виключити саме Ваші нещасливі цифри! " +
                "Оберіть два таких від 1 до 9 включно та кількість шатлів, які треба пронумерувати.");
        Scanner sc = new Scanner(System.in);
        int first;
        int second;
        int shuttle;
        for (; ; ) {
            System.out.println("Перша цифра: ");
            if (sc.hasNextInt()) {
                first = sc.nextInt();
                if (first < 0 || first > 9) {
                    print(first, 0, 9);
                    sc.nextLine();
                    continue;
                }
            } else {
                print(0, 0, 0);
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("Друга цифра: ");
            if (sc.hasNextInt()) {
                second = sc.nextInt();
                if (second < 0 || second > 9) {
                    print(second,0,9);
                    sc.nextLine();
                    continue;
                }
            } else {
                print(0, 0, 0);
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("Кількість шатлів (обмеження в 500): ");
            if (sc.hasNextInt()) {
                shuttle = sc.nextInt();
                if (shuttle < 1 || shuttle > 500) {
                    print(shuttle,1,500);
                    sc.nextLine();
                    continue;
                }
            } else {
                print(0, 0, 0);
                sc.nextLine();
                continue;
            }
            break;
        }
        list(first, second, shuttle);
    }

    private static void print(int i, int sys1, int sys2) {

        if (i < sys1 || i > sys2) {
            System.out.println("Помилкові дані! Має бути число від " + sys1 + " до " + sys2 + "! Спробуй ще раз.");
        }
        if (i == 0) {
            System.out.println("Помилкові дані! Має бути саме число!");
        }
    }

    private static void list(int first, int second, int shuttle) {
        System.out.println("Список пронумерованих шатлів вийшов таким: ");

        int count = 0;
        int i = 1;
        int k;
        int j;

        while (i <= shuttle) {

            count++;

            if ((count % 100) == 0) {
                k = count / 10;
            } else {
                k = count % 100 / 10;
            }

            j = count % 10;

            if ((k == first || k == second) || (j == first || j == second)) {
                continue;
            } else if (count == first || count == second) {
                continue;
            } else {
                System.out.println("Номер шатлу: " + count);
            }

            i++;

        }
    }
}
