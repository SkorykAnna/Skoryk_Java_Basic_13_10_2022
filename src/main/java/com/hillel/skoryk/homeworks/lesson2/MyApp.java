package com.hillel.skoryk.homeworks.lesson2;

public class MyApp {
    public static void main(String[] args) {
//          48.888996444 2.234832394
//        48°53'20.39" N 2°14'5.40" E
        System.out.println("GPS COORDINATES OF GRANDE ARCH, FRANCE" + "\n");
        System.out.println("DMS COORDINATES are: ");
        char north = 'N';
        char east = 'E';
        int LatitudeNorthDegree = 48;
        char degree = '°';
        int LatitudeNorthMinutes = 53;
        char minutes = '\'';
        float LatitudeNorthSeconds = 20.39F;
        char seconds = '\"';
        int LongitudeEastDegree = 2;
        int LongitudeEastMinutes = 14;
        float LongitudeEastSeconds = 5.40F;
        double northD = 48.888996444;
        double eastD = 2.234832394;
        System.out.println("" + LatitudeNorthDegree + degree + LatitudeNorthMinutes + minutes +
                LatitudeNorthSeconds + seconds + " " + north + " " +
                LongitudeEastDegree + degree + LongitudeEastMinutes +
                minutes + LongitudeEastSeconds + seconds + " " + east);
        System.out.println("DD COORDINATES are: " + "\n" + northD + " " + north + " " + eastD + " " + east);

    }
}
