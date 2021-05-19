package exercise;

import java.util.Scanner;

public class RadiansToDegrees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radii = Double.parseDouble(sc.nextLine());
        int result = (int) (radii * 180 / Math.PI);

        System.out.println(result);
    }
}
