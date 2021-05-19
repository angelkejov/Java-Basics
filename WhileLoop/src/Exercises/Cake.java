package Exercises;

import java.util.Scanner;

public class Cake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        int sizeOfCake = width * length;
        while (true) {
            String input = sc.nextLine();

            if (!input.equals("STOP")) {
                int pieces = Integer.parseInt(input);
                sizeOfCake -= pieces;
                if (sizeOfCake <= 0) {
                    int diff = Math.abs(sizeOfCake);
                    System.out.printf("No more cake left!" +
                            " You need %d pieces more.", diff);
                    break;
                }
            } else {
                int diff = Math.abs(sizeOfCake);
                System.out.printf("%d pieces are left.", diff);
                break;
            }
        }
    }
}
