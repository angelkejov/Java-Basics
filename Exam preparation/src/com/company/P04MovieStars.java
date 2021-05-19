package com.company;

import java.util.Scanner;

public class P04MovieStars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String input = sc.nextLine();

        while (!input.equals("ACTION")) {
            String actors = input;
            if (actors.length() <= 15) {
                double salary = Double.parseDouble(sc.nextLine());
                budget -= salary;
            } else {
                budget = budget - (budget * 0.20);
            }

            if (budget < 0) {
                break;
            }
            input = sc.nextLine();
        }

        if (budget < 0) {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
