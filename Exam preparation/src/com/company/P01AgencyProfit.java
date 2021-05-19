package com.company;

import java.util.Scanner;

public class P01AgencyProfit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int ticketsForAdults = Integer.parseInt(sc.nextLine());
        int ticketsForKids = Integer.parseInt(sc.nextLine());
        double netPriceForAdult = Double.parseDouble(sc.nextLine());
        double servicePrice = Double.parseDouble(sc.nextLine());

        double netPriceKids = netPriceForAdult - (netPriceForAdult * 0.7);
        double adultPriceWithService = netPriceForAdult + servicePrice;
        double kidPriceWithService = servicePrice + netPriceKids;

        double totalPrice = (ticketsForKids * kidPriceWithService) +
                (ticketsForAdults * adultPriceWithService);

        double profit = totalPrice * 0.20;

        System.out.printf("The profit of your agency" +
                " from %s tickets is %.2f lv.", name, profit);
    }
}
