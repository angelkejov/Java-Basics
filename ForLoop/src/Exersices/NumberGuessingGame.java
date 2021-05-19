package Exersices;

import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/////////////////////");
        System.out.println("NUMBER GUESSING GAME!");
        System.out.println("/////////////////////\n");

        System.out.println("**************************************************");
        System.out.println("         RULES:");
        System.out.println("We have selected a random number \n" +
                "between 1 and 100. See if you can guess it in \n" +
                "10 turns or fewer. We'll tell you if your \n" +
                "guess was too high or too low.");
        System.out.println("**************************************************\n");

        System.out.print("Enter a guess: ");
        int n = Integer.parseInt(sc.nextLine());

        int lives = 10;
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);

        String yesOrNo;
        List<Integer> previousGuesses = new ArrayList<>();
        while (true) {
            if (n == rand_int1) {
                System.out.println("You win!");
                System.out.println("One more game?");
                yesOrNo = sc.nextLine();

                if (yesOrNo.equals("yes".toLowerCase())) {
                    continue;
                } else {
                    break;
                }
            } else {
                System.out.println("Try again!");
                System.out.print("Enter a guess: ");
                n = Integer.parseInt(sc.nextLine());
                if (n < rand_int1) {
                    System.out.println("Last guess was too low!");
                } else if (n > rand_int1) {
                    System.out.println("Last guess was too high!");
                }
                lives--;

                previousGuesses.add(n);

                if (lives == 0) {
                    System.out.println();
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    System.out.println("!!!GAME OVER!!!");
                    System.out.printf("The number was %d.%n", rand_int1);
                    System.out.print("You guesses was: ");
                    for (Integer previousGuess : previousGuesses) {
                        System.out.print(previousGuess + " ");
                    }
                    System.out.println();
                    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

                    System.out.println("One more game? - 'yes' or 'no'");

                    yesOrNo = sc.nextLine();
                    if (yesOrNo.equals("yes".toLowerCase())) {
                        continue;
                    } else {
                        break;
                    }
                }
            }

        }
    }
}
