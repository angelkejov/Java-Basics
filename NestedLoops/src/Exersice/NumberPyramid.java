package Exersice;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int num = 0;
        boolean isEqual = false;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                num++;
                if (num > n) {
                    isEqual = true;
                    break;
                }
                System.out.print(num + " ");
            }
            if (isEqual) {
                break;
            }
            System.out.println();
        }
    }
}
