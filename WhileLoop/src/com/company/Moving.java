package com.company;

import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        int cubicMeters = width * length * height;
        int boxesKbMeters = 0;
        while (true) {
            String input = sc.nextLine();

            if (!input.equals("Done")) {
                int numbers = Integer.parseInt(input);
                boxesKbMeters += numbers;
                if (boxesKbMeters > cubicMeters) {
                    int diff = Math.abs(boxesKbMeters - cubicMeters);
                    System.out.printf("No more free space!" +
                            " You need %d Cubic meters more.", diff);
                    break;
                }
            } else {
                int diff = Math.abs(cubicMeters - boxesKbMeters);
                System.out.printf("%d Cubic meters left.", diff);
                break;
            }

        }
    }
}
