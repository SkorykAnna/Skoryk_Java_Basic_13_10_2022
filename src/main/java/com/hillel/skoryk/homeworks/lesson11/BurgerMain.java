package com.hillel.skoryk.homeworks.lesson11;

public class BurgerMain {

    public static void main(String[] args) {

        Burger orderBurger = new Burger();

        orderBurger.regularBurger();
        System.out.println();
        orderBurger.dietaryBurger();
        System.out.println();
        orderBurger.doubleMeatBurger();

    }
}
