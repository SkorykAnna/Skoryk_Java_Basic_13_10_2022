package com.hillel.skoryk.homeworks.lesson8;

import java.util.Arrays;

public class LotteryInsertion {

    public static void main(String[] args) {

        int n = 7;
        int count = 0;

        int [] arrCompanyNumbers = array(n);
        int [] arrUserNumbers = array(n);

        sort(arrCompanyNumbers, n);
        sort(arrUserNumbers,n);

        for (int i = 0; i < n; i++) {
            if (arrCompanyNumbers[i] == arrUserNumbers[i]) {
                count++;
            }
        }
        System.out.println(Arrays.toString(arrCompanyNumbers) + " числа, які загадані фірмою-організатором лотереї.");
        System.out.println(Arrays.toString(arrUserNumbers) + " числа, які вказав гравець.");
        System.out.println();
        System.out.println("Кількість збігів: " + count);
    }

    public static int[] array(int n) {

        int [] array = new int [n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
    private static void sort(int[] array, int n) {

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

        }
    }

}
