package com.company;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dogCount = Integer.parseInt(sc.nextLine());
        int otherAnimals = Integer.parseInt(sc.nextLine());

        double priceForDogs = dogCount * 2.50;
        double priceForOther = otherAnimals * 4.00;

        double finalResult = priceForDogs + priceForOther;
        System.out.println(finalResult + " lv.");
    }
}
