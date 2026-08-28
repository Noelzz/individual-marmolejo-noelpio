package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_MultiplicationTable_Marmolejo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char again;

        do {
            System.out.print("Enter a multiplication table : ");
            int number = scanner.nextInt();

            System.out.println("\nMultiplication Table of " + number);

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }

            System.out.print("\nDo you want to try another table? (Y/N): ");
            again = scanner.next().charAt(0);

            System.out.println();

        } while (again == 'Y' || again == 'y');

        System.out.println("Program ended.");

        scanner.close();
    }
}