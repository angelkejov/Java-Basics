package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = Integer.parseInt(sc.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        }
    }
}
