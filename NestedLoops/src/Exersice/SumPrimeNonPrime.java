package Exersice;

import java.util.Scanner;

public class SumPrimeNonPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")) {
            boolean isPrime = true;
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
                input = sc.nextLine();
                continue;
            }

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    nonPrimeSum += number;
                    break;
                }
            }
            if (isPrime) {
                primeSum += number;
            }

            input = sc.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
