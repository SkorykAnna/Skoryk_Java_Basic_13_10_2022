package com.hillel.skoryk.homeworks.lesson9;

import org.jetbrains.annotations.NotNull;

//import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        System.out.println("Будь ласка, введіть два числа для масивів: ");
        System.out.print("Перше число: ");
        int m = inSys();
        System.out.print("Друге число: ");
        int n = inSys();

//      Щоб створити два окремих масиви:
//        int [][] arr1 = array(m,n);
//        int [][] arr2 = array(n,m);

        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];

        for (int i = 0, k = 0; i < m; i++, k++) {
            for (int j = 0, l = 0; j < n; j++, l++) {
                array1[i][j] = (int) (Math.random() * 10);
                array2[j][k] = array1[i][j];
            }
        }

        System.out.println("Перший масив: ");
//        System.out.println(Arrays.deepToString(array1));
       printArr(array1);
        System.out.println("Другий масив: ");
//        System.out.println(Arrays.deepToString(array2));
        printArr(array2);

    }

    private static int inSys() {

        Scanner sc = new Scanner(System.in);

        int number;

        for (; ; ) {
            if (!sc.hasNextInt()) {
                System.out.println("Помилкові дані! Має бути число. Спробуй ще раз.");
                sc.nextLine();
            } else {
                number = sc.nextInt();
                if (number < 0) {
                    System.out.println("Помилкові дані! Має бути число. Спробуй ще раз.");
                    sc.nextLine();
                }
                break;
            }
        }

        return number;
    }

    public static void printArr(int[] @NotNull [] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

//    public static int[][] array(int n, int m) {
//
//        int [][] array = new int [n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                array[i][j] = (int) (Math.random() * 10);
//            }
//        }
//
//        return array;
//    }
//

