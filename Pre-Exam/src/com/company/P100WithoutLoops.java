package com.company;


import java.util.Scanner;

public class P100WithoutLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printNumbers(n);
    }

    static void printNumbers(int number) {
        if(number > 0) {
            printNumbers(number - 1);
            System.out.println(number);
        }
    }
}
