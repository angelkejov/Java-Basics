package com.company;

import java.util.Scanner;

public class P02MaidenParty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceForGirlParty = Double.parseDouble(sc.nextLine());
        int loveListCount = Integer.parseInt(sc.nextLine());
        int candlesCount = Integer.parseInt(sc.nextLine());
        int keyHoldersCount = Integer.parseInt(sc.nextLine());
        int articulsCount = Integer.parseInt(sc.nextLine());
        int luckySupriseCount = Integer.parseInt(sc.nextLine());

        double sum = loveListCount * 0.60 + candlesCount * 7.20
                + keyHoldersCount * 3.60
                + articulsCount * 18.20 + luckySupriseCount * 22;

        int totalArticles = loveListCount + candlesCount + keyHoldersCount +
                articulsCount + luckySupriseCount;

        double discount = 0;
        if (totalArticles > 25) {
             discount = sum * 0.35;
        }

        double endingPrice = sum - discount;
        double hosting = endingPrice * 0.10;

        double profit = endingPrice - hosting;

        if (profit > priceForGirlParty) {
            double diff = Math.abs(profit - priceForGirlParty);
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            double diff = Math.abs(profit - priceForGirlParty);
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
