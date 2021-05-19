package com.company;

import java.util.Scanner;

public class P02CatWalking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(sc.nextLine());
        int walkCounterPerDay = Integer.parseInt(sc.nextLine());
        int catsCalories = Integer.parseInt(sc.nextLine());

        int totalMin = minutesWalk * walkCounterPerDay;
        int totalBurnedCalories = totalMin * 5;

        double halfCalories = catsCalories  * 0.5;

        if (totalBurnedCalories >= halfCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: " +
                     "%d.", totalBurnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough." +
                    " Burned calories per day: %d.", totalBurnedCalories);
        }
    }
}
