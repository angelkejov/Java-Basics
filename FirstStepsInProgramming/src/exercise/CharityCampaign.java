package exercise;

import java.util.Scanner;

public class CharityCampaign {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        int chefs = Integer.parseInt(sc.nextLine());
        int cakes = Integer.parseInt(sc.nextLine());
        int waffles = Integer.parseInt(sc.nextLine());
        int pancakes = Integer.parseInt(sc.nextLine());

        double cakeSum = cakes * 45;
        double wafflesSum = waffles * 5.80;
        double pancakesSum = pancakes * 3.20;

        double supPerDay = (cakeSum + wafflesSum + pancakesSum) * chefs;
        double totalSum = supPerDay * days;
        double charitySum = totalSum - totalSum * 1/ 8;

        System.out.printf("%.2f", charitySum);
    }
}
