package Exercise;

import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int k = (int)(50 * 120) / 100;

        int n = Integer.parseInt(sc.nextLine());
        double bonusScore = 0;

        if (n <= 100) {
            bonusScore += 5;
        } else if (n > 1000) {
            bonusScore += 0.1 * n;
        } else {
            bonusScore += 0.2 * n;
        }

        if (n % 2 == 0) {
            bonusScore += 1;
        } else if (n % 10 == 5) {
            bonusScore += 2;
        }

        double result = bonusScore + n;
        System.out.println(bonusScore);
        System.out.println(result);
    }
}
