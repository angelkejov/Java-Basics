package Exercise;

import java.util.Scanner;

public class GodzillaVSKong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double filmBudget = Double.parseDouble(sc.nextLine());
        int peopleCount = Integer.parseInt(sc.nextLine());
        double priceForClothes = Double.parseDouble(sc.nextLine());


        double decorsSum = (10 * filmBudget) / 100;
        double clothesSum = peopleCount * priceForClothes;
        if (peopleCount > 150) {
            clothesSum = clothesSum - (0.10 * clothesSum);
        }
        double totalSumForFilm = decorsSum + clothesSum;

        if (totalSumForFilm > filmBudget) {
            double diff = Math.abs(filmBudget - totalSumForFilm);
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva " +
                    "more.", diff);
        } else {
            double diff = Math.abs(filmBudget - totalSumForFilm);
            System.out.printf("Action!\n" +
                    "Wingard starts filming with " +
                    "%.2f leva left.", diff);
        }
    }
}
