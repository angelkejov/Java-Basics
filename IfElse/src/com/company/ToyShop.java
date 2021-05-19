package com.company;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double excursionPrice = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double moneyTaken = (puzzles * 2.60) + (dolls * 3.00) + (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2.00);
        if ((puzzles + dolls + teddyBears + minions + trucks) >= 50) {
            moneyTaken *=  0.75 ;
        }
        moneyTaken *= 0.90;
        if (moneyTaken < excursionPrice) {
            excursionPrice -= moneyTaken;
            System.out.printf("Not enough money! %.2f lv needed.",excursionPrice);

        } else {
            moneyTaken -= excursionPrice;
            System.out.printf("Yes! %.2f lv left.", moneyTaken);
        }
    }
}
