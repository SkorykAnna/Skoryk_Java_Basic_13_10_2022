package com.hillel.skoryk.homeworks.lesson11;

public class Burger {

        String buns;
        String meat;
        String cheese;
        String greens;
        String mayonnaise;

    public Burger() {
        buns = "2 buns";
        meat = "meat";
        cheese = "cheese";
        greens = "greens";
        mayonnaise = "mayonnaise";
    }

    void regularBurger () {
            System.out.println("Your order is a regular burger. It consists of: " +
                    buns + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ". ");
        }

        void dietaryBurger () {
            System.out.println("Your order is a dietary burger. It consists of: " +
                    buns + ", " + meat + ", " + cheese + ", " + greens + ".");
        }

        void doubleMeatBurger () {
            System.out.println("Your order is a burger with double meat. It consists of: " +
                    buns + ", " + meat + " and extra " + meat + ", " + cheese + ", " + greens +
                    ", " + mayonnaise + ".");
        }


}
