package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magicalNum = Integer.parseInt(sc.nextLine());

        int counter = 0;
        boolean flag = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicalNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter,
                            i, j, i + j);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (!flag) {
            System.out.printf("%d combinations - " +
                    "neither equals " +
                    "%d", counter, magicalNum);
        }
    }
}
