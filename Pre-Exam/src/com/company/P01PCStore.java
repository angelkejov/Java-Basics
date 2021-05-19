package com.company;

import java.util.Scanner;

public class P01PCStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceInDollarsProcessor = Double.parseDouble(sc.nextLine());
        double priceInDollarsVideoCard = Double.parseDouble(sc.nextLine());
        double priceInDollarsForOneRam = Double.parseDouble(sc.nextLine());
        int ramCount = Integer.parseInt(sc.nextLine());
        double discountPercent = Double.parseDouble(sc.nextLine());

        double processorLeva = priceInDollarsProcessor * 1.57;
        double videoCardLeva = priceInDollarsVideoCard * 1.57;
        double oneRamLeva = priceInDollarsForOneRam * ramCount;
        double totalLevaForRam = oneRamLeva * 1.57;

        double processorDiscount = processorLeva - (processorLeva * discountPercent);
        double videoCardDiscount = videoCardLeva - (videoCardLeva * discountPercent);

        double totalPrice = processorDiscount + videoCardDiscount + totalLevaForRam;

        System.out.printf("Money needed - %.2f leva.", totalPrice);
    }
}
