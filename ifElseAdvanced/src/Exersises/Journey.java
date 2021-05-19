package Exersises;

import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        if (budget <= 100) {
            if (season.equals("summer")) {
                double k = (30 * budget) / 100;
                System.out.printf("Somewhere in Bulgaria\nCamp - %.2f",
                        k);
            } else if (season.equals("winter")) {
                double k = (70 * budget) / 100;
                System.out.printf("Somewhere in Bulgaria\nHotel - %.2f",
                        k);
            }
        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                double k = (40 * budget) / 100;
                System.out.printf("Somewhere in Balkans\nCamp - %.2f",
                        k);
            } else if (season.equals("winter")) {
                double k = (80 * budget) / 100;
                System.out.printf("Somewhere in Balkans\nHotel - %.2f",
                        k);
            }
        } else if (budget > 1000) {
            if (season.equals("summer")) {
                double k = (90 * budget) / 100;
                System.out.printf("Somewhere in Europe\nHotel - %.2f",
                        k);
            } else if (season.equals("winter")) {
                double k = (90 * budget) / 100;
                System.out.printf("Somewhere in Europe\nHotel - %.2f",
                        k);
            }
        }
    }
}
