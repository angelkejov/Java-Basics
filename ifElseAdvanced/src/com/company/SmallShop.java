package com.company;

import java.util.Scanner;

public class SmallShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0;

        switch (product) {
            case "coffee":
                if (town.equals("Sofia")) {
                    price = 0.5;
                } else if (town.equals("Plovdiv")) {
                    price = 0.4;
                } else if (town.equals("Varna")) {
                    price = 0.45;
                }
                break;
            case "water":
                if (town.equals("Sofia")) {
                    price = 0.8;
                } else if ((town.equals("Plovdiv")) || (town.equals("Varna"))) {
                    price = 0.7;

                }
                break;
            case "beer":
                if (town.equals("Sofia")) {
                    price = 1.2;
                } else if (town.equals("Plovdiv")) {
                    price = 1.15;
                } else if (town.equals("Varna")) {
                    price = 1.10;
                }
                break;
            case "sweets":
                if (town.equals("Sofia")) {
                    price = 1.45;
                } else if (town.equals("Plovdiv")) {
                    price = 1.30;
                } else if (town.equals("Varna")) {
                    price = 1.35;
                }
                break;
            case "peanuts":
                if (town.equals("Sofia")) {
                    price = 1.6;
                } else if (town.equals("Plovdiv")) {
                    price = 1.5;
                } else if (town.equals("Varna")) {
                    price = 1.55;
                }
                break;
        }
        double order = price * quantity;
        System.out.println(order);
    }
}
