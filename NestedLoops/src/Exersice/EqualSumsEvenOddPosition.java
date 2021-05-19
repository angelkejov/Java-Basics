package Exersice;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());

        for (int i = n1; i <= n2; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int currNumber = i;
            for (int j = 6; j >= 1; j--) {
                int digit = currNumber % 10;

                currNumber /= 10;
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
