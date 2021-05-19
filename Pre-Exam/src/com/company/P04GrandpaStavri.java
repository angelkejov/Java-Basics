package com.company;

import java.util.Scanner;

public class P04GrandpaStavri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        double liters = 0;
        double degrees = 0;
        for (int i = 0; i < n; i++) {
            double rakiaQuantity = Double.parseDouble(sc.nextLine());
            double rakiaDegree = Double.parseDouble(sc.nextLine());

            liters += rakiaQuantity;
            degrees += rakiaQuantity *= rakiaDegree;
        }

        double totalDegrees = degrees / liters;

        System.out.printf("Liter: %.2f%n", liters);
        System.out.printf("Degrees: %.2f%n", totalDegrees);

        if (totalDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (totalDegrees >= 38 && totalDegrees < 42) {
            System.out.println("Super!");
        } else if (totalDegrees > 42) {
            System.out.println("Dilution with distilled water!");
        }
    }
}
