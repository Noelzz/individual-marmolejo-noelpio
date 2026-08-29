package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_Marmolejo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Display numbers
        System.out.println();
        System.out.println("You entered:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Display sum and average
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        // Stretch Goal: Find highest and lowest
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > highest) {
                highest = numbers[i];
            }

            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);

        scanner.close();
    }
}
