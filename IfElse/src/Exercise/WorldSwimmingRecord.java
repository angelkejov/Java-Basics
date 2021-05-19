package Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double range = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());
        double swimmingTime = range * timeForOneMeter;
        double extraTimePerOneMeter = Math.floor(range/15) * 12.5;
        double totalTime = swimmingTime + extraTimePerOneMeter;
        if (record <= totalTime){
            double needSeconds = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", needSeconds);
        } else {
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
