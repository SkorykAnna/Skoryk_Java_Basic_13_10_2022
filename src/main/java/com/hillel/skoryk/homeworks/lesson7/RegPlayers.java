package com.hillel.skoryk.homeworks.lesson7;

public class RegPlayers {

    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран

        int[] firstTeam = new int[25];
        int[] secondTeam = new int[25];
        int sum1 = 0;
        int sum2 = 0;

//      Примітка, я закоментувала цикл запису масиву 2-ї команди, так як в цьому випадку в умові задані
//      розміри масивів рівні та становлять 25. Також вирішила залишити можливість задавати віковий діапазон, хоча він
//      теж йде за умовченням. (дуже логічно, да)

        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = randomAge(18, 40);
            sum1 += firstTeam[i];
            secondTeam[i] = randomAge(18, 40);
            sum2 += secondTeam[i];
        }

//        for (int i = 0; i < secondTeam.length; i++) {
//            secondTeam[i] = randomAge(18, 40);
//            sum2 += secondTeam[i];
//        }

        print(firstTeam, sum1, 1);
        print(secondTeam, sum2, 2);

    }

    private static int randomAge(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + 1)));
    }

//    private static int[] array(int length) {
//        int[] arr = new int[length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = randomAge(18, 40);
//        }
//        return arr;
//    }

    private static void print(int[] arr, int sum, int teamNum) {

        System.out.println("Гравці " + teamNum + " команди мають такий вік: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i] + " , ");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + ".");
            } else {
                System.out.print(arr[i] + " , ");
            }
        }
        System.out.println("Середній вік команди становить: " + (sum / arr.length));

    }
}