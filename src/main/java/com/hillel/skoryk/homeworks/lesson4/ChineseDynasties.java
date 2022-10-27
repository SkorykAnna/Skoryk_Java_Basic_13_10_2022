package com.hillel.skoryk.homeworks.lesson4;

public class ChineseDynasties {

    public static void main(String[] args) {
        // династія Лі показники атаки:
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        // династія Лі кількість одного типу:
        int countLi = 860;
        // династія Мінь показники атаки:
        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;
        // династія Мінь кількість одного типу:
        int countMin = (int) (countLi * 1.5);
        int fullPowerLi = (warriorLi + archerLi + riderLi) * countLi;
        int fullPowerMin = (warriorMin + archerMin + riderMin) * countMin;

        System.out.println("Загальна атака армії Лі: " + fullPowerLi);
        System.out.println("Загальна атака армії Мінь: " + fullPowerMin);

        if (fullPowerMin > fullPowerLi) {
            System.out.println("Армія Мінь сильша армії Лі на " + (fullPowerMin - fullPowerLi));
        }
//        if (fullPowerMin == fullPowerLi) {
//            System.out.println("Армії однаково сильні");
//        }
        else {
            System.out.println("Армія Лі сильша армії Мін на " + (fullPowerLi - fullPowerMin));
        }

    }

}
