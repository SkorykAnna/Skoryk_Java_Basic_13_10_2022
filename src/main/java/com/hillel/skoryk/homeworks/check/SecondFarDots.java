package com.hillel.skoryk.homeworks.check;

import java.util.Scanner;

public class SecondFarDots {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double dist;
        double answer = 0;
        int count = 0;

        int[][] array = new int[n][2];
        int[][] arrayFarthest = new int[n][2];

        for (int i = 0; i < n; i++) {

            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();

            dist = distance(array[i][0], array[i][1]);

            if (dist != 0) {
                if (dist > answer) {
                    answer = dist;
                    arrayFarthest[0][0] = array[i][0];
                    arrayFarthest[0][1] = array[i][1];
                    count++;
                } else if (dist == answer) {
                    arrayFarthest[count][0] = array[i][0];
                    arrayFarthest[count][1] = array[i][1];
                    count++;
                }
            }
        }

        for (int h = 0; h < n; h++) {
            if ((arrayFarthest[h][0] != 0) && (arrayFarthest[h][1] != 0)) {
                System.out.println(arrayFarthest[h][0] + " " + arrayFarthest[h][1]);
            } else {
                break;
            }
        }
    }

    private static double distance(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}