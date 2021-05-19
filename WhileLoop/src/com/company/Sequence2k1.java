package com.company;

import java.util.Scanner;

public class Sequence2k1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int k  = 1;
        while (k <= num) {
            System.out.println(k);

            k = k * 2 + 1;
        }
    }
}
