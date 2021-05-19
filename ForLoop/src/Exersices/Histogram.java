package Exersices;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1= 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 =0;

        for (int i = 0; i <n ; i++) {
            double num = Integer.parseInt(scanner.nextLine());
            if (num>=1&&num<200){
                p1=p1+1 ;}
            else if (num>=200&&num<400){
                p2=p2+1 ;}
            else if (num>=400&&num<600){
                p3=p3+1 ;}
            else  if (num>=600&&num<800){
                p4=p4+1 ;}
            else if (num>=800){
                p5=p5+1 ;}


        }

        double result1= (double)p1/n*100;
        double result2= (double)p2/n*100;
        double result3= (double)p3/n*100;
        double result4= (double)p4/n*100;
        double result5= (double)p5/n*100;

        System.out.printf("%n%.2f%%",result1);
        System.out.printf("%n%.2f%%",result2);
        System.out.printf("%n%.2f%%",result3);
        System.out.printf("%n%.2f%%",result4);
        System.out.printf("%n%.2f%%",result5);
    }
}
