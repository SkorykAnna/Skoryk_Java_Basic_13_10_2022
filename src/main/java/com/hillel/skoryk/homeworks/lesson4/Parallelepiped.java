package com.hillel.skoryk.homeworks.lesson4;

public class Parallelepiped {
    public static void main(String[] args) {

        int a = 8;
        int b = 4;
        int c = 3;
        double alpha = 45;

        float volume = (a * b * c * (float) Math.sin(alpha));

        System.out.println("Об'єм паралелепіпеда = " + volume + " cm3");

        int volumeP = (a * b * c);

        System.out.println("Об'єм прямокутного паралелепіпеда = " + volumeP + " cm3");

        int length = (a + b + c) * 2;

        System.out.println("Сумарна довжина паралелепіпеда = " + length + " cm");

    }
}
