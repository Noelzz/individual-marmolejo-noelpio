package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_MultiplicationTables_NestedForLoop_Marmolejo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char again;

        do {

            System.out.print("How many multiplication tables do you want to display?: ");
            int numberOfTables = scanner.nextInt();

            for (int table = 1; table <= numberOfTables; table++) {

                System.out.println("\nMultiplication Table of " + table);

                for (int i = 1; i <= 10; i++) {
                    System.out.println(table + " * " + i + " = " + (table * i));
                }

                System.out.println();
            }

            System.out.print("Do you want to display another set of tables? (Y/N): ");
            again = scanner.next().charAt(0);

            System.out.println();

        } while (again == 'Y' || again == 'y');

        System.out.println("Program ended.");

        scanner.close();
    }
}