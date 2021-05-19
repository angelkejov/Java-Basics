package com.company;

import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double roomForOne = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;

        int days = Integer.parseInt(sc.nextLine());
        String roomType = sc.nextLine();
        String grade = sc.nextLine();

        int nights = days - 1;
        double price = 0;
        if (roomType.equals("room for one person")) {
            price = nights * roomForOne;

            if (grade.equals("positive")) {
                price = price + (price * 0.25);
            } else if (grade.equals("negative")) {
                price = price - (price * 0.1);
            }
        } else if (roomType.equals("apartment")) {
            price = nights * apartment;
            if (days < 10) {
                price = price - (price * 0.3);
            } else if (days > 10 && days <= 15) {
                price = price - (price * 0.35);
            } else if (days > 15) {
                price = price - (price * 0.5);
            }

            if (grade.equals("positive")) {
                price = price + (price * 0.25);
            } else if (grade.equals("negative")) {
                price = price - (price * 0.1);
            }
        } else if (roomType.equals("president apartment")) {
            price = nights * presidentApartment;
            if (days < 10) {
                price = price - (price * 0.1);
            } else if (days > 10 && days <= 15) {
                price = price - (price * 0.15);
            } else if (days > 15) {
                price = price - (price * 0.20);
            }

            if (grade.equals("positive")) {
                price = price + (price * 0.25);
            } else if (grade.equals("negative")) {
                price = price - (price * 0.1);
            }
        }

        System.out.printf("%.2f", price);
    }
}
