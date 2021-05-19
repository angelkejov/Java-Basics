package com.company;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(sc.nextLine());

            sum += numbers;
        }

        System.out.println(sum);
    }
}
