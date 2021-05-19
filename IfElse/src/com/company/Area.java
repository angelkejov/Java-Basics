package com.company;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String figure = sc.nextLine();

        if (figure.equals("square")) {
            double side = Double.parseDouble(sc.nextLine());
            double res = side * side;
            System.out.printf("%.3f", res);
        } else if (figure.equals("triangle")) {
            double n1 = Double.parseDouble(sc.nextLine());
            double n2 = Double.parseDouble(sc.nextLine());

            double res = (n1 * n2) / 2;
            System.out.printf("%.3f", res);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(sc.nextLine());

            double res = Math.PI * (radius * radius);
            System.out.printf("%.3f", res);
        } else if (figure.equals("rectangle")) {
            double n1 = Double.parseDouble(sc.nextLine());
            double n2 = Double.parseDouble(sc.nextLine());

            double res = n1 * n2;
            System.out.printf("%.3f", res);
        }
    }
}
