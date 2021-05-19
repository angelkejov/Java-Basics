package Exersices;

import java.util.Scanner;

public class DivideWithoutRemainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        double percentage2 = 0;
        double percentage3 = 0;
        double percentage4 = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int numb = Integer.parseInt(sc.nextLine());
            count++;

            if (numb % 2 == 0) {
                percentage2++;
            }
            if (numb % 3 == 0) {
                percentage3++;
            }
            if (numb % 4 == 0) {
                percentage4++;
            }
        }

        double p1Percent = (percentage2 / count) * 100;
        double p2Percent = (percentage3 / count) * 100;
        double p3Percent = (percentage4 / count) * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
    }
}
