package Exersices;

import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(sc.nextLine());
            sum += numbers;
            if (numbers > max) {
                max = numbers;
            }
        }

        int sumWithoutMaxNumber = sum - max;

        if (max == sumWithoutMaxNumber) {
            System.out.printf("Yes\nSum = %d", max);
        } else {
            int diff = Math.abs(max - sumWithoutMaxNumber);
            System.out.printf("No\nDiff = %d", diff);
        }
    }
}
