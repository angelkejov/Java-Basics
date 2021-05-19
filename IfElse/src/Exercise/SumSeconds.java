package Exercise;

import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstSeconds = Integer.parseInt(sc.nextLine());
        int secondSeconds = Integer.parseInt(sc.nextLine());
        int thirdSeconds = Integer.parseInt(sc.nextLine());

        int total = firstSeconds + secondSeconds + thirdSeconds;
        int minutes = total / 60;
        int second = total % 60;

        if (second < 10) {
            System.out.printf("%d:0%d", minutes, second);
        } else {
            System.out.printf("%d:%d", minutes, second);
        }
    }
}
