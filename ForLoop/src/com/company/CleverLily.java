package com.company;

import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        double priceOfWashingMachine = Double.parseDouble(sc.nextLine());
        int priceOfOneToy = Integer.parseInt(sc.nextLine());

        int countToys = 0;
        int savedMoney = 0;
        int totalSavedMoney = 0;
        int countTakenMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney += 10;
                totalSavedMoney += savedMoney;
                countTakenMoney++;
            } else {
                countToys++;
            }
        }

        int toySoldPrice = countToys * priceOfOneToy;
        double totalMoney = (totalSavedMoney + toySoldPrice) - countTakenMoney;

        if (totalMoney >= priceOfWashingMachine) {
            System.out.printf("Yes! %.2f", totalMoney - priceOfWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceOfWashingMachine - totalMoney);
        }
    }
}
