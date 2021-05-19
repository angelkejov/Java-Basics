package com.company;

import java.util.Scanner;

public class P05ExcursionSale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seaCount = Integer.parseInt(sc.nextLine());
        int mountainCount = Integer.parseInt(sc.nextLine());

        int profit = 0;
        String input = sc.nextLine();
        while (!input.equals("Stop")) {
            String packet = input;

            if (packet.equals("sea") && seaCount > 0) {
                profit += 680;
                seaCount--;
            } else if (packet.equals("mountain") && mountainCount > 0) {
                profit += 499;
                mountainCount--;
            }

            if (seaCount == 0 && mountainCount == 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }


            input = sc.nextLine();
        }
        System.out.printf("Profit: %d leva.", profit);
    }
}
