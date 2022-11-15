package com.hillel.skoryk.homeworks.lesson8;

import java.util.Arrays;

public class LotteryUpd {

    public static void main(String[] args) {

        int n = 7;
        int count = 0;

        int[] arrCompanyNumbers = array(n);
        int[] arrUserNumbers = array(n);

        Arrays.sort(arrCompanyNumbers);
        Arrays.sort(arrUserNumbers);

        System.out.println(Arrays.toString(arrCompanyNumbers) + " числа, які загадані фірмою-організатором лотереї.");
        System.out.println(Arrays.toString(arrUserNumbers) + " числа, які вказав гравець.");
        System.out.println();

        int[] arrCoincidence = new int[n];

        for (int i = 0; i < n; i++) {
            if (arrCompanyNumbers[i] == arrUserNumbers[i]) {

                count++;
                arrCoincidence[i] = i;
            }
        }

        System.out.println("Кількість збігів: " + count);

        System.out.println();
        System.out.print("Збіг в позиціях: ");

        if (count == 0) {
            System.out.println("Не знайдено");
        } else {
            for (int j = 0; j < n; j++) {
                if (arrCoincidence[j] != 0) {
                    System.out.print(arrCoincidence[j] + " ");
                }
            }
        }
    }

    public static int[] array(int n) {

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

}
