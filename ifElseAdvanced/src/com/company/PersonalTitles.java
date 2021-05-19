package com.company;

import java.util.Scanner;

public class PersonalTitles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double years = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();

        if (gender.equals("m") && years >= 16) {
            System.out.println("Mr.");
        } else if (gender.equals("m") && years < 16) {
            System.out.println("Master");
        } else if (gender.equals("f") && years >= 16) {
            System.out.println("Ms.");
        } else if (gender.equals("f") && years < 16) {
            System.out.println("Miss");
        }
    }
}
