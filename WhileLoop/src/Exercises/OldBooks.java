package Exercises;

import java.util.Scanner;

public class OldBooks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String searchedBook = sc.nextLine();
        int bookCount = 0;
        boolean isFound = false;
        String input = sc.nextLine();
        while (!input.equals("No More Books")) {
            if (input.equals(searchedBook)) {
                isFound = true;
                break;
            }
            bookCount++;
            input = sc.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d " +
                    "books and found it.", bookCount);
        } else {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.", bookCount);
        }
    }
}
