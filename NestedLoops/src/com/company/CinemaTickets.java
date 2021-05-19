package com.company;

import java.util.Scanner;

public class CinemaTickets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int counterTotalTickets = 0;
        int studentCounter = 0;
        int standardCounter = 0;
        int kidsCounter = 0;

        while (!input.equals("Finish")) {
            String movie = input;
            int countFreeSeats = Integer.parseInt(sc.nextLine());

            int counterTicket = 0;
            String command = sc.nextLine();
            while (!command.equals("End")) {
                String typeTicket = command;
                counterTicket++;

                switch (typeTicket) {

                    case "student":
                        studentCounter++;
                        break;

                    case "standard":
                        standardCounter++;
                        break;

                    case "kid":
                        kidsCounter++;
                        break;
                }

                if (counterTicket == countFreeSeats) {
                    break;
                }
                command = sc.nextLine();
            }

            counterTotalTickets += counterTicket;
            System.out.printf("%s - %.2f%% full.%n", movie, counterTicket * 1.0 /
                    countFreeSeats * 100);
            input = sc.nextLine();
        }

        System.out.println("Total tickets: " + counterTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCounter * 1.0 / counterTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardCounter * 1.0 / counterTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidsCounter * 1.0 / counterTotalTickets * 100);
    }
}
