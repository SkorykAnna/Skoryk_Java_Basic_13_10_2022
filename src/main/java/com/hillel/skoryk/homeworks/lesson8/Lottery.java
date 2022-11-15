package com.hillel.skoryk.homeworks.lesson8;

import java.util.Arrays;

public class Lottery {

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
        int temp;
        for (int h = 0; h < n - 1; h++) {
            for (int p = 0; p < n - h - 1; p++) {
                if (array[p] > array[p + 1]) {
                    temp = array[p];
                    array[p] = array[p + 1];
                    array[p + 1] = temp;
                }
            }
        }
    }

}
