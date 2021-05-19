package exercise;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double depositSum = Double.parseDouble(sc.nextLine());
        int depositHalf = Integer.parseInt(sc.nextLine());
        double percentage = Double.parseDouble(sc.nextLine());

        double totalResult = depositSum + depositHalf
                * ((depositSum * percentage / 100) / 12);

        System.out.println(totalResult);
    }
}
