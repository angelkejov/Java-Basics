package exercise;

import java.util.Scanner;

public class BirthdayParty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rent = Integer.parseInt(sc.nextLine());

        double priceCake = (double) (20 * rent) / 100;
        double priceDrinks = priceCake - (priceCake * 0.45);
        double funGuyPrice = (double) rent / 3;

        double total = rent + priceCake + priceDrinks + funGuyPrice;

        System.out.println(total);
    }
}
