package exercise;

import java.util.Scanner;

public class USDtoBGN {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double usd = Double.parseDouble(sc.nextLine());
        double leva = usd * 1.79549;
        System.out.println(leva);
    }
}
