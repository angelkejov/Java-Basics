package com.company;

import java.util.Scanner;

public class EvenPowersOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int power = Integer.parseInt(sc.nextLine());
        int n = 1;

        for (int i = 0; i <= power; i += 2) {
            System.out.println(n);
            n = n * 2 * 2;
        }
    }
}
