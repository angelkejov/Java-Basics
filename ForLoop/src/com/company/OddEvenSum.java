package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenSum {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int odd = 0;
        int even = 0;

        for (int i = 0; i < n ; i++) {
            int num = 0;
            try {
                num = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (i % 2 == 0){
                even += num;
            } else {
                odd += num;
            }

        }
        if (odd == even){
            System.out.println("Yes");
            System.out.println("Sum = " + even);
        } else {
            System.out.println("No\nDiff = " + Math.abs(odd - even));
        }

    }
}
