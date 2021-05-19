package com.company;

import java.util.Scanner;

public class P06SumAndProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int sum = a + b + c + d;
                        int mult = a * b * c * d;

                        if (sum == mult && n % 10 == 5) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            return;
                        } else if (mult / sum == 3 && n % 3 == 0) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Nothing found");
    }
}
