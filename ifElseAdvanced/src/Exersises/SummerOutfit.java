package Exersises;

import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int gradus = Integer.parseInt(scanner.nextLine());
        String diapazon = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (diapazon) {
            case "Morning":
                if (gradus >= 10 && gradus <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";

                } else if (gradus > 18 && gradus <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (gradus >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (gradus >= 10 && gradus <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";

                } else if (gradus > 18 && gradus <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (gradus >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (gradus >= 10 && gradus <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";

                } else if (gradus > 18 && gradus <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (gradus >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);

    }
}
