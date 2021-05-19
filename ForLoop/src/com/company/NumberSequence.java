package com.company;

import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(sc.nextLine());

            max = Math.max(max, numbers);
            min = Math.min(min, numbers);
        }

        System.out.printf("Max number: %d\nMin number: %d", max, min);
    }
}
