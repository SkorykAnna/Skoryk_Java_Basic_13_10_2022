package com.hillel.skoryk.homeworks.check;

import java.util.Scanner;

public class SecondFarDots {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] array = new int[n][2];

        for (int h = 0; h < n; h++) {
            array[h][0] = sc.nextInt();
            array[h][1] = sc.nextInt();
            sc.nextLine();
        }

        int dist;
        int answer = 0;

        int[][] arrayF = new int[2][2];

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {

                dist = distance(array[i][0], array[i][1], array[j][0], array[j][1]);

                if ((dist >= answer) && (i < j)) {

                    answer = dist;

                    arrayF[0][0] = array[i][0];
                    arrayF[0][1] = array[i][1];

                    arrayF[1][0] = array[j][0];
                    arrayF[1][1] = array[j][1];

                }
            }
        }

        System.out.println(arrayF[0][0] + " " + arrayF[0][1]);
        System.out.println(arrayF[1][0] + " " + arrayF[1][1]);

    }

    private static int distance(int x1, int x2, int y1, int y2) {
        int xSq = powS(x1, y1);
        int ySq = powS(x2, y2);
        return (xSq + ySq);
    }

    private static int powS(int n1, int n2) {
        return ((n2 - n1) * (n2 - n1));
    }

}
