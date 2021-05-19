package Exersises;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        int r = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        double profit = 0;
        if (type.equals("Premiere")) {
            profit = r * c * 12;
        } else if (type.equals("Normal")) {
            profit = r * c * 7.50;
        } else if (type.equals("Discount")) {
            profit = r * c * 5;
        }

        System.out.printf("%.2f leva", profit);
    }
}
