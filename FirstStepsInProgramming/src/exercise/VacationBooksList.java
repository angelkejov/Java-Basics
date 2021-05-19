package exercise;

import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pages = Integer.parseInt(sc.nextLine());
        int pagesForOneHour = Integer.parseInt(sc.nextLine());
        int daysCounter = Integer.parseInt(sc.nextLine());

        int totalTimerForBook = pages / pagesForOneHour;
        int hoursPerDay = totalTimerForBook / daysCounter;

        System.out.println(hoursPerDay);
    }
}
