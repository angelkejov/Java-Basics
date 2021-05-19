package com.company;

import java.util.Scanner;

public class ProjectsCreation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int countOfProjects = Integer.parseInt(sc.nextLine());

        int result = countOfProjects * 3;
        System.out.printf("The architect %s will need " +
                "%d hours to complete %d" +
                " project/s.", name, result, countOfProjects);
    }
}
