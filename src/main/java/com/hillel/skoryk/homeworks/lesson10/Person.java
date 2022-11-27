package com.hillel.skoryk.homeworks.lesson10;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", 2936729462846L));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", 12312412412L));
        System.out.println(personInfo("Sherlock", "Holmes", "London", 37742123513L));

    }

    private static String personInfo (String name, String surname, String city, long number) {
        String callInfo = "Зателефонувати громадянинові " + name + " " + surname +
                " з міста " + city + " можна за номером " + number + ".";
        return callInfo;
    }
}
