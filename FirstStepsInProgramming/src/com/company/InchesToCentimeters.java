package com.company;

import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inch = Double.parseDouble(sc.nextLine());
        double samtimeters  = inch * 2.54;

        System.out.printf("%.2f", samtimeters);
    }
}
