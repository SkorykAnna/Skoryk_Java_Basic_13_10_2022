package com.hillel.skoryk.homeworks.check;

import java.util.Scanner;

public class FifthAreaPolygon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int h = 0; h < n; h++) {
            array[h][0] = sc.nextInt();
            array[h][1] = sc.nextInt();
        }

        System.out.format("%.1f", area(array,n));

    }

    private static double area (int [][] arr, int n)
    {

        double area = 0.0;

        int j = n - 1;
        for (int i = 0; i < n; i++)
        {
            area += (arr[j][0] + arr[i][0]) * (arr[j][1] - arr[i][1]);

            j = i;
        }

        return Math.abs(area / 2.0);
    }
}