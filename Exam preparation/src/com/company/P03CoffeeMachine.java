package com.company;

import java.util.Scanner;

public class P03CoffeeMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String drink = sc.nextLine();
        String sugar = sc.nextLine();
        int drinkCount = Integer.parseInt(sc.nextLine());

        double totalPrice = 0;
        if (drink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                totalPrice = drinkCount * 0.90;
                totalPrice = totalPrice * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = drinkCount;
            } else if (sugar.equals("Extra")) {
                totalPrice = drinkCount * 1.20;
            }

            if (drinkCount >= 5) {
                totalPrice = totalPrice * 0.75;
            }
        } else if (drink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                totalPrice = drinkCount;
                totalPrice = totalPrice * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = drinkCount * 1.20;
            } else if (sugar.equals("Extra")) {
                totalPrice = drinkCount * 1.60;
            }
        } else if (drink.equals("Tea")) {
            if (sugar.equals("Without")) {
                totalPrice = drinkCount * 0.50;
                totalPrice = totalPrice * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = drinkCount * 0.60;
            } else if (sugar.equals("Extra")) {
                totalPrice = drinkCount * 0.70;
            }
        }

        if (totalPrice > 15) {
            totalPrice = totalPrice * 80;
        }

        System.out.printf("You bought %d cups of %s for %.2f " +
                "lv.",drinkCount, drink, totalPrice);
    }
}
