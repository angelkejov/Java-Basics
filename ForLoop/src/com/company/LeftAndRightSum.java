package com.company;

import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sumRight = 0;
        int sumLeft = 0;
        for (int i = 0; i < n * 2; i++) {
            int numbers = Integer.parseInt(sc.nextLine());

            if (i < n) {
                sumLeft += numbers;
            } else {
                sumRight += numbers;
            }
        }

        if (sumLeft == sumRight) {
            System.out.println("Yes, sum = " + sumLeft);
        } else {
            int diff = Math.abs(sumLeft - sumRight);
            System.out.println("No, diff = " + diff);
        }
    }
}
