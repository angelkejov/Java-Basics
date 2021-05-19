package com.company;

import java.util.Scanner;

public class YardGreening {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kvMeters = Integer.parseInt(sc.nextLine());
        double priceForGreening = kvMeters * 7.61;
        double priceWithDiscount = priceForGreening * 0.18;

        double finalPrice = priceForGreening - priceWithDiscount;
        System.out.printf("The final price is: %.2f lv.\n" +
                "The discount is: %.2f lv", finalPrice, priceWithDiscount);
    }
}
