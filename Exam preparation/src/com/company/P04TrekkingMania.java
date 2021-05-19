package com.company;

import java.util.Scanner;

public class P04TrekkingMania {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groups = Integer.parseInt(sc.nextLine());

        int sumMusala = 0;
        int sumMonglan = 0;
        int totalPeople = 0;
        int sumKilinmangaro = 0;
        int sumK2 = 0;
        int sumEverest = 0;
        for (int i = 1; i < groups; i++) {
            int peopleSingleGroup = Integer.parseInt(sc.nextLine());

            if (peopleSingleGroup <= 5) {
                sumMusala = sumMusala + peopleSingleGroup;
            } else if (peopleSingleGroup <= 12) {
                sumMusala = sumMonglan + peopleSingleGroup;
            } else if (peopleSingleGroup <= 25) {
                sumKilinmangaro = sumKilinmangaro + peopleSingleGroup;
            } else if (peopleSingleGroup <= 40) {
                sumK2 = sumK2 + peopleSingleGroup;
            } else {
                sumEverest = sumEverest + peopleSingleGroup;
            }
            totalPeople = totalPeople + peopleSingleGroup;
        }

        System.out.printf("%.2f%%%n", (double)sumMusala / totalPeople * 100);
        System.out.printf("%.2f%%%n", (double)sumMonglan / totalPeople * 100);
        System.out.printf("%.2f%%%n", (double)sumKilinmangaro / totalPeople * 100);
        System.out.printf("%.2f%%%n", (double)sumK2 / totalPeople * 100);
        System.out.printf("%.2f%%%n", (double)sumEverest / totalPeople * 100);
    }
}
