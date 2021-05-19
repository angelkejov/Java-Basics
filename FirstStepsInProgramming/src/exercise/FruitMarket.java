package exercise;

import java.util.Scanner;

public class FruitMarket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceStrawberries = Double.parseDouble(sc.nextLine());
        double bananasQuantity = Double.parseDouble(sc.nextLine());
        double orangesQuantity = Double.parseDouble(sc.nextLine());
        double raspberriesQuantity = Double.parseDouble(sc.nextLine());
        double strawberriesQuantity = Double.parseDouble(sc.nextLine());

        double priceRaspberries = priceStrawberries / 2;
        double orangesPrice = priceRaspberries - (0.40 * priceRaspberries);
        double bananasPrice = priceRaspberries - (0.80 * priceRaspberries);
        double raspberriesSum = raspberriesQuantity * priceRaspberries;
        double orangeSum = orangesQuantity * orangesPrice;
        double bananasSum = bananasPrice * bananasQuantity;
        double strawberriesSum = strawberriesQuantity * priceStrawberries;

        double totalSum = raspberriesSum + orangeSum + bananasSum + strawberriesSum;

        System.out.printf("%.2f", totalSum);
    }
}
