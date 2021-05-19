package RetakeExam;

import java.util.Scanner;

public class P01FoodDelivery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(sc.nextLine());
        int fishMenu = Integer.parseInt(sc.nextLine());
        int veganMenu = Integer.parseInt(sc.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double veganPrice = veganMenu * 8.15;

        double totalMenuPrice = chickenPrice + fishPrice + veganPrice;
        double desert = totalMenuPrice * 0.20;
        double deliveryPrice = 2.50;

        double finalRes = totalMenuPrice + desert + deliveryPrice;
        System.out.printf("Total: %.2f", finalRes);
    }
}
