package com.company;

import java.util.Scanner;

public class P03FinalCompetition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dancersCount = Integer.parseInt(sc.nextLine());
        double pointsCount = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String place = sc.nextLine();

        double winedSum = dancersCount * pointsCount;
        if (place.equals("Abroad")) {
            winedSum = winedSum + (winedSum * 0.50);
            if (season.equals("summer")) {
                winedSum = winedSum - (winedSum * 0.10);
            } else if (season.equals("winter")) {
                winedSum = winedSum - (winedSum * 0.15);
            }
        } else if (place.equals("Bulgaria")) {
            if (season.equals("summer")) {
                winedSum = winedSum - (winedSum * 0.05);
            } else if (season.equals("winter")) {
                winedSum = winedSum - (winedSum * 0.08);
            }
        }

        double priceAfterConsumption = winedSum;
        double forCharity = priceAfterConsumption * 0.75;
        double moneyLeft = priceAfterConsumption  - forCharity;
        double moneyForDancers = moneyLeft / dancersCount;


        System.out.printf("Charity - %.2f%n", forCharity);
        System.out.printf("Money per dancer - %.2f", moneyForDancers);
    }
}
