package Exersices;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String webSite = scanner.nextLine().toLowerCase();
            if (webSite.equals("facebook")) {
                salary = salary - 150;
            }
            else if (webSite.equals("instagram")) {
                salary = salary - 100;
            }
            else if (webSite.equals("reddit")) {
                salary = salary - 50;
            }

            if (salary <= 0){
                System.out.println("You have lost your salary.");

                break;
            }
        }
        if(salary>0)
            System.out.println(salary);
    }
}
