package exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());

        double aquariumVolume = length * width * height;
        double totalLitres = aquariumVolume * 0.001;
        double percentLiters = percent * 0.01;
        double neededLitres = totalLitres * (1 - percentLiters);

        System.out.printf("%.2f", neededLitres);
    }
}
