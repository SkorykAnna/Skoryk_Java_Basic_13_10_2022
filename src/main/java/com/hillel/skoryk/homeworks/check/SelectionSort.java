package com.hillel.skoryk.homeworks.check;

import java.util.Scanner;

public class SelectionSort  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 1000) System.out.print("");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(selectionSort(array, n));
    }

    private static int selectionSort(int[] array, int n) {
        int pos;
        int temp;
        int count = 0;
        int first = array[0];
        for (int i = 0; i < n; i++) {
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[pos]) {
                    pos = j;
                }
            }
            temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;
            if (count == 1 && first == array[0]) {
                count = 0;
            }
            if (first == array[pos] || first == temp){
                if(temp != array[n - 1]) count++;
            }
        }

        return count;
    }
}


