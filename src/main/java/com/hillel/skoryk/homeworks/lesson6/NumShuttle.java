package com.hillel.skoryk.homeworks.lesson6;

public class NumShuttle {
    public static void main(String[] args) {
        System.out.println("У Японії числа 4 та 9 вважаються нещасливими.");
        System.out.println("Тому ми пронумерували 100 космічних шатлів для перевезення людей на Марс так, " +
                "щоб у номерах шатлів не траплялося нещасливих чисел.");
        System.out.println("Список пронумерованих шатлів вийшов таким: ");
        another();
       /* int count = 0;
        int i = 1;
        int k;
        int j;

        while (i <= 100) {

            count++;

            if ((count % 100) == 0) {
                k = count / 10;
            } else {
                k = count % 100 / 10;
            }

            j = count % 10;

            if ((k == 9 || k == 4) || (j == 9 || j == 4)) {
                continue;
            } else if (count == 9 || count == 4) {
                continue;
            } else {
                System.out.println("Номер шатлу: " + count);
            }

            i++;

        } */
    }

    private static void another () {
        int counter = 0;

        for (int i =1; counter < 100; i++) {
            if(String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
                continue;
            }
            System.out.println("Номер шатлу: " + i);
            counter++;
        }
        System.out.println(counter);
    }
}
