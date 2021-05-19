package RetakeExam;

import java.util.Scanner;

public class P02Safari {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        double litersGasNeeded = Double.parseDouble(sc.nextLine());
        String weekDay = sc.nextLine();

        double gasPrice = litersGasNeeded * 2.10;
        double totalWithTeacher = gasPrice + 100;

        if (weekDay.equals("Sunday")) {
            totalWithTeacher = totalWithTeacher - (totalWithTeacher * 0.20);
        } else if (weekDay.equals("Saturday")) {
            totalWithTeacher = totalWithTeacher - (totalWithTeacher * 0.10);
        }

        double diff = Math.abs(budget - totalWithTeacher);
        if (budget > totalWithTeacher) {
            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",diff);
        }
    }
}
