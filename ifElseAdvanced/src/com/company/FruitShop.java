package com.company;

import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        double price = 0;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
        || day.equals("Thursday") || day.equals("Friday")) {
            if (product.equals("banana")) {
                price = 2.50;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("apple")) {
                price = 1.20;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("orange")) {
                price = 0.85;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("grapefruit")) {
                price = 1.45;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("kiwi")) {
                price = 2.70;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("pineapple")) {
                price = 5.50;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("grapes")) {
                price = 3.85;
                System.out.printf("%.2f", price * quantity);
            } else {
                System.out.println("error");
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (product.equals("banana")) {
                price = 2.70;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("apple")) {
                price = 1.25;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("orange")) {
                price = 0.90;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("grapefruit")) {
                price = 1.60;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("kiwi")) {
                price = 3.00;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("pineapple")) {
                price = 5.60;
                System.out.printf("%.2f", price * quantity);
            } else if (product.equals("grapes")) {
                price = 4.20;
                System.out.printf("%.2f", price * quantity);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

    }
}
