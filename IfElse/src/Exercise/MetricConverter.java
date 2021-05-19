package Exercise;

import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = Double.parseDouble(sc.nextLine());
        String inputUnit = sc.nextLine();
        String outputUnit = sc.nextLine();

        double res = 0;
        if (inputUnit.equals("m")) {
            res = n * 1000;
        } else if (inputUnit.equals("cm")) {
            res = n * 10;
        } else if (inputUnit.equals("mm")) {
            res = n;
        }

        if (outputUnit.equals("m")) {
            n = res / 1000;
        } else if (outputUnit.equals("cm")) {
            n = res / 10;
        } else if (outputUnit.equals("mm")) {
            n = res;
        }

        System.out.printf("%.3f", n);
    }
}
