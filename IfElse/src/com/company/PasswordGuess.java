package com.company;

import java.util.Scanner;

public class PasswordGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "s3cr3t!P@ssw0rd";
        String input = sc.nextLine();

        if (password.equals(input)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
